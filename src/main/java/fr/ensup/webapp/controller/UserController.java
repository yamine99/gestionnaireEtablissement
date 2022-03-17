package fr.ensup.webapp.controller;


import fr.ensup.webapp.model.User;
import fr.ensup.webapp.service.Secure;
import fr.ensup.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;

@Controller
public class UserController {

  @Autowired
  private UserService service;

   @GetMapping("/")
    public String ShowLoginPage(Model model, HttpServletRequest request){
            model.addAttribute("user", new User());
       request.getSession().setAttribute("isAuthenticated", false);
        return "login";
    }

    @GetMapping("/login")
    public String ShowLoginPage2(Model model,  HttpServletRequest request){
        request.getSession().setAttribute("isAuthenticated", false);
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/register")
    public String ShowRegisterPage(Model model){
            model.addAttribute("user", new User());
            String [] roles = {"Responsable", "Directeur" };
            model.addAttribute("roles", roles);
        return "register";
    }

    @PostMapping("/register/user/save")
      public String SaveUser(User user, RedirectAttributes ra) throws NoSuchAlgorithmException {
        String passwordHash = Secure.hachPassword(user.getMdp());
            user.setMdp(passwordHash);
            service.save(user);
            ra.addFlashAttribute("message", "Un nouveau utilisateur a été ajouté !");

      return "redirect:/";
    }

    @PostMapping("/user")
      public String getUser(User user,  RedirectAttributes ra, HttpServletRequest request ) throws NoSuchAlgorithmException {
            String passwordHash = Secure.hachPassword(user.getMdp());
            user.setMdp(passwordHash);

           if(!service.get(user).isEmpty() && service.get(user).get(0).getRole().equals("Directeur") ){
               request.getSession().setAttribute("isAuthenticated", true);
               System.out.println( service.get(user).get(0).getRole());
                return "redirect:/accueil";
           }else {
                 ra.addFlashAttribute("message", "Directeur non trouvé !\n veuillez s'enregistrer en tant que Directeur");
               return "redirect:/";
           }


      }
}

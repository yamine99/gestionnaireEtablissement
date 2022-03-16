package fr.ensup.webapp.controller;



import fr.ensup.webapp.model.Person;
import fr.ensup.webapp.model.Student;
import fr.ensup.webapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StudentController {


  @Autowired private StudentService service;


    @GetMapping("/accueil")
    public String showArticlList(Model model){
        List<Person> listeStudent = service.findAll();

        model.addAttribute("listeStudent", listeStudent);

        return "index";
    }

     @GetMapping("/accueil/add")
      public String ShowNewAddArticl(Model model, RedirectAttributes ra){
          model.addAttribute("student", new Student());

          model.addAttribute("pageTitle", "Ajouter un étudiant");

          return "student_form";
    }

      @PostMapping("accueil/add/save")
      public String SaveStudent(Student student,  RedirectAttributes ra){
           System.out.println(student.toString());
            service.save(student);
            ra.addFlashAttribute("message", "Un nouveau student a été ajouté !");

         return "redirect:/accueil";
    }

    @GetMapping("/delete/{id}")
    public String DeleteStudent(@PathVariable("id") int id, Model model, RedirectAttributes ra) throws StudentService.ArticleNotFoundException {
        service.delete(id);
        ra.addFlashAttribute("message", "Un  student a été supprimé !");

        return "redirect:/accueil";
    }
/*

    @GetMapping("/accueil/update/{id}")
      public String Updatestudent(@PathVariable("id") int id, Model model, RedirectAttributes ra){
          String [] types = {"Accessoire", "Cosmétique", "Vêtement", "Gadget", "Outil", "Matérial informatique" };
          model.addAttribute("categories", types);

            try{
               student student = service.get(id);
                 model.addAttribute("student", student);
                 model.addAttribute("pageTitle", "Editer l'student : "+id );
                return "student_form";
            }catch (studentService.studentNotFoundException e){
                  ra.addFlashAttribute("message", e.getMessage());
                   return "redirect:/";
            }

    }


       @GetMapping("/accueil/delete/{id}")
      public String Deletestudent(@PathVariable("id") int id, RedirectAttributes ra){

        try{
            service.delete(id);
            ra.addFlashAttribute("message", "l' student avec l'id "+id +" a été supprimé !");
            return "redirect:/";
        }catch (studentService.studentNotFoundException e){
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/accueil";
            }


    }

*/
}

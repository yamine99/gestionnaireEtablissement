package fr.ensup.webapp.service;
import fr.ensup.webapp.model.User;


import fr.ensup.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

     @Autowired
     private UserRepository repo;

       public void save(User user){
       repo.save(user);
    }


    public List<User> get(User user) {

        return  repo.findUserDistinctByEmailAndMdp(user.getEmail(), user.getMdp());

    }
}

package fr.ensup.webapp.repository;

import fr.ensup.webapp.model.Person;
import fr.ensup.webapp.model.User;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

  List<User> findUserDistinctByEmailAndMdp(String email, String mdp);
}


package fr.ensup.webapp.repository;

import fr.ensup.webapp.model.User;



import java.util.List;

public interface UserRepository extends  PersonRepository {

  List<User> findUserDistinctByEmailAndMdp(String email, String mdp);
}


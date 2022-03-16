package fr.ensup.webapp.repository;


import fr.ensup.webapp.model.Person;
import fr.ensup.webapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface PersonRepository extends  CrudRepository< Person, Integer>{

}

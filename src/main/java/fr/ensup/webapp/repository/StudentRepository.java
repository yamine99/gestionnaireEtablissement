package fr.ensup.webapp.repository;


import fr.ensup.webapp.model.Person;
import fr.ensup.webapp.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {


}

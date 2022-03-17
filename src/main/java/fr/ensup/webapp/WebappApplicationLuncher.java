package fr.ensup.webapp;

import fr.ensup.webapp.model.Person;
import fr.ensup.webapp.model.Role;
import fr.ensup.webapp.model.Student;
import fr.ensup.webapp.model.User;
import fr.ensup.webapp.repository.PersonRepository;
import fr.ensup.webapp.repository.StudentRepository;
import fr.ensup.webapp.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Date;


@SpringBootApplication
public class WebappApplicationLuncher {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(WebappApplicationLuncher.class, args);


        Person student = new Student(1,"yamine", "salem","salem@gmail.com", "17 avenue ", "0769660846","12/25/2000" );
        Person user = new User(1,"yamine", "salem","salem@gmail.com", "17 avenue ", "0769660846","12345", "");

      // studentRepository.save(student);
     // userRepository.save(user);
    }

}

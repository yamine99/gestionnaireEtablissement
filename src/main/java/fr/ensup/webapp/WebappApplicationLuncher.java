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


@SpringBootApplication
public class WebappApplicationLuncher {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(WebappApplicationLuncher.class, args);

        PersonRepository studentRepository =
                configurableApplicationContext.getBean(StudentRepository.class);
        PersonRepository userRepository =
                configurableApplicationContext.getBean(UserRepository.class);
        Person student = new Student("yamine", "salem","salem@gmail.com", "17 avenue ", "0769660846" );
        Person user = new User("yamine", "salem","salem@gmail.com", "17 avenue ", "0769660846","12345", "");

       //studentRepository.save(student);
     // userRepository.save(user);
    }

}

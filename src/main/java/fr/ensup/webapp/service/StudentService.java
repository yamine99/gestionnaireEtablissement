package fr.ensup.webapp.service;


import fr.ensup.webapp.model.Person;
import fr.ensup.webapp.model.Student;
import fr.ensup.webapp.repository.PersonRepository;
import fr.ensup.webapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired private StudentRepository repo;

    public List<Student> findAll(){
        return (List<Student>) repo.findAll();
    }

     public void save(Student student){
         repo.save(student);
    }

     public void delete(int id) throws ArticleNotFoundException {

          if(repo.count() !=0){
                 repo.deleteById(id);
            }else{
            throw new ArticleNotFoundException("Article non trouvée avec l' "+id);
          }

      }


     public Student get(int id) throws ArticleNotFoundException {
        Optional<Student> result=  repo.findById(id);

        if(result.isPresent()){
            return result.get();
        }
            throw new ArticleNotFoundException("Article non trouvée avec l' "+id);

      }


    public class ArticleNotFoundException extends Throwable {
        public ArticleNotFoundException(String message) {
            super(message);
        }
    }
}

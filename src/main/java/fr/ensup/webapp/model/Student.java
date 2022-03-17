package fr.ensup.webapp.model;


import javax.persistence.*;
import java.sql.Date;

@Entity
public class Student extends  Person{


   private String dateofbirth;


    public Student(int id,String firstName, String lastName, String email, String adresse, String tel, String dateofbirth) {
        super(id, firstName, lastName, email, adresse, tel);
        this.dateofbirth = dateofbirth;
    }


    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "dateofbirth=" + dateofbirth +
                '}';
    }
}

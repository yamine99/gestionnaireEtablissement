package fr.ensup.webapp.model;


import javax.persistence.*;

@Entity
@DiscriminatorValue (value = "STUDENT")
public class Student extends  Person{

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;


    public Student(String firstName, String lastName, String email, String adresse, String tel) {
        super(firstName, lastName, email, adresse, tel);
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return  super.toString()+"Student{" +
                "id=" + id +
                '}';
    }
}

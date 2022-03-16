package fr.ensup.webapp.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue (value = "USER")
public class User extends  Person{
     @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;

    private String mdp;

    @Enumerated(value = EnumType.STRING)
    private String role;

    public User(String firstName, String lastName, String email, String adresse, String tel, String mdp, String role) {
        super(firstName, lastName, email, adresse, tel);
        this.mdp =mdp;
        this.role =role;
    }

    public User() {
        super();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

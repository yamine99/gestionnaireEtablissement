package fr.ensup.webapp.model;

import javax.persistence.*;

@Entity
public class User extends  Person{

    private String mdp;
    private String role;

    public User(int id,String firstName, String lastName, String email, String adresse, String tel, String mdp, String role) {
        super(id, firstName, lastName, email, adresse, tel);
        this.mdp =mdp;
        this.role =role;
    }

    public User() {
        super();

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

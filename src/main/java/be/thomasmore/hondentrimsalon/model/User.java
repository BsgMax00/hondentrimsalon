package be.thomasmore.hondentrimsalon.model;

import javax.persistence.*;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_generator")
    @SequenceGenerator(name = "User_generator", sequenceName = "User_seq", allocationSize = 1)
    @Id
    private int id;
    private String username;
    private String password;
    private String role;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

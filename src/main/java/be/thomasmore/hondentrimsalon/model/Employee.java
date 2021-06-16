package be.thomasmore.hondentrimsalon.model;

import javax.persistence.*;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Employee_generator")
    @SequenceGenerator(name = "Employee_generator", sequenceName = "Employee_seq", allocationSize = 1)
    @Id
    private int id;
    private String name;
    private String photo;
    private String info;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

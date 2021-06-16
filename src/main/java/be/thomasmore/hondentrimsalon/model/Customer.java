package be.thomasmore.hondentrimsalon.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Customer_generator")
    @SequenceGenerator(name = "Customer_generator", sequenceName = "Customer_seq", allocationSize = 1)
    @Id
    private int id;
    private String name;
    private String PhoneNumber;

    @ManyToMany
    private Collection<Dog> dogs;

    public Customer() {
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

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Collection<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Collection<Dog> dogs) {
        this.dogs = dogs;
    }
}

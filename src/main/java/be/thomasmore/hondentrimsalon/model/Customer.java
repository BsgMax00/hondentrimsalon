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
    private String Email;
    private String Regio;

    @OneToOne
    private Dog dog;

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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRegio() {
        return Regio;
    }

    public void setRegio(String regio) {
        Regio = regio;
    }
}

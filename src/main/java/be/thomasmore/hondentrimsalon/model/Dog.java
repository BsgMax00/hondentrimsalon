package be.thomasmore.hondentrimsalon.model;

import javax.persistence.*;

@Entity
public class Dog {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Dog_generator")
    @SequenceGenerator(name = "Dog_generator", sequenceName = "Dog_seq", allocationSize = 1)
    @Id
    private int id;
    private String name;
    private String gender;
    private String age;
    private String extraInfo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Breed breed;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Fur fur;

    @OneToOne
    private Customer customer;

    public Dog() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Fur getFur() {
        return fur;
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

package be.thomasmore.hondentrimsalon.model;

import javax.persistence.*;

@Entity
public class Breed {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Breed_generator")
    @SequenceGenerator(name = "Breed_generator", sequenceName = "Breed_seq", allocationSize = 1)
    @Id
    private int id;
    private String BreedName;
    private double smallSizePrice;
    private double mediumSizePrice;
    private double bigSizePrice;

    public Breed() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreedName() {
        return BreedName;
    }

    public void setBreedName(String breedName) {
        BreedName = breedName;
    }

    public double getSmallSizePrice() {
        return smallSizePrice;
    }

    public void setSmallSizePrice(double smallSizePrice) {
        this.smallSizePrice = smallSizePrice;
    }

    public double getMediumSizePrice() {
        return mediumSizePrice;
    }

    public void setMediumSizePrice(double mediumSizePrice) {
        this.mediumSizePrice = mediumSizePrice;
    }

    public double getBigSizePrice() {
        return bigSizePrice;
    }

    public void setBigSizePrice(double bigSizePrice) {
        this.bigSizePrice = bigSizePrice;
    }
}

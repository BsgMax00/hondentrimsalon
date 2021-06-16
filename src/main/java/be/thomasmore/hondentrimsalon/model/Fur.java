package be.thomasmore.hondentrimsalon.model;

import javax.persistence.*;

@Entity
public class Fur {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Fur_generator")
    @SequenceGenerator(name = "Fur_generator", sequenceName = "Fur_seq", allocationSize = 1)
    @Id
    private int id;
    private String furType;

    public Fur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String hairType) {
        this.furType = hairType;
    }
}

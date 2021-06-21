package be.thomasmore.hondentrimsalon.model;

import javax.persistence.*;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Product_generator")
    @SequenceGenerator(name = "Product_generator", sequenceName = "Product_seq", allocationSize = 1)
    @Id
    private int id;
    private String ProductName;
    private String photo;
    private double price;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

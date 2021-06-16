package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.*;
import be.thomasmore.hondentrimsalon.repositories.BreedRepository;
import be.thomasmore.hondentrimsalon.repositories.CustomerRepository;
import be.thomasmore.hondentrimsalon.repositories.DogRepository;
import be.thomasmore.hondentrimsalon.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CreateController {
    //Customer creation
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/create/Customer")
    public String Customer(Model model){

        Customer customer = new Customer();
        model.addAttribute("customer", customer);

        return "create/Customer";
    }

    @PostMapping("/create/Customer")
    public String CustomerPost(Model model,
                               @RequestParam String CustomerName,
                               @RequestParam String CustomerPhoneNumber){

        Customer customer = new Customer();

        customer.setName(CustomerName);
        customer.setPhoneNumber(CustomerPhoneNumber);

        customerRepository.save(customer);

        return "redirect:/CustomerList";
    }

    //Dog creation
    @Autowired
    private DogRepository dogRepository;

    @GetMapping("/create/Dog")
    public String Dog(Model model){

        Dog dog = new Dog();
        model.addAttribute("dog", dog);

        return "/create/Dog";
    }

    @PostMapping("/create/Dog")
    public String DogPost(Model model,
                          @RequestParam String Name,
                          @RequestParam String Gender,
                          @RequestParam String ExtraInfo,
                          @RequestParam Breed Breed,
                          @RequestParam Fur Fur){

        Dog dog = new Dog();
        dog.setName(Name);
        dog.setGender(Gender);
        dog.setExtraInfo(ExtraInfo);

        dogRepository.save(dog);

        return "redirect:/DogList";
    }

    //Product creation
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/create/Product")
    public String Product(Model model){

        Product product = new Product();
        model.addAttribute("product", product);

        return "/create/Product";
    }

    @PostMapping("/create/Product")
    public String Productpost(Model model,
                               @RequestParam String ProductName,
                               @RequestParam double ProductPrice) {

        Product product = new Product();

        product.setProductName(ProductName);
        product.setPrice(ProductPrice);

        productRepository.save(product);

        return "redirect:/AboutUs";
    }
}

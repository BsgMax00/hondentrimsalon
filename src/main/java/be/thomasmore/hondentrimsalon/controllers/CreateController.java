package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.*;
import be.thomasmore.hondentrimsalon.repositories.*;
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
                               @RequestParam String CustomerPhoneNumber,
                               @RequestParam String CustomerEmail,
                               @RequestParam String CustomerRegio){

        Customer customer = new Customer();

        customer.setName(CustomerName);
        customer.setPhoneNumber(CustomerPhoneNumber);
        customer.setDog(null);
        customer.setEmail(CustomerEmail);
        customer.setRegio(CustomerRegio);

        customerRepository.save(customer);

        return "redirect:/create/Dog";
    }

    //Dog creation
    @Autowired
    private DogRepository dogRepository;

    @Autowired
    private BreedRepository breedRepository;

    @Autowired
    private FurRepository furRepository;

    @GetMapping("/create/Dog")
    public String Dog(Model model){

        Dog dog = new Dog();
        Iterable<Breed> breeds = breedRepository.findAll();
        Iterable<Fur> furs = furRepository.findAll();
        Iterable<Customer> customers = customerRepository.findAll();

        model.addAttribute("dog", dog);
        model.addAttribute("breeds", breeds);
        model.addAttribute("furs", furs);
        model.addAttribute("customers", customers);

        return "/create/Dog";
    }

    @PostMapping("/create/Dog")
    public String DogPost(Model model,
                          @RequestParam String DogName,
                          @RequestParam String DogGender,
                          @RequestParam String DogAge,
                          @RequestParam String DogInfo,
                          @RequestParam Breed DogBreed,
                          @RequestParam Fur DogFur,
                          @RequestParam Customer DogCustomer){

        Dog dog = new Dog();
        Customer customer = customerRepository.findById(DogCustomer.getId()).get();

        dog.setName(DogName);
        dog.setGender(DogGender);
        dog.setAge(DogAge);
        dog.setExtraInfo(DogInfo);
        dog.setBreed(DogBreed);
        dog.setFur(DogFur);
        dog.setCustomer(DogCustomer);
        customer.setDog(dog);

        dogRepository.save(dog);

        return "redirect:/DogList/filter";
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

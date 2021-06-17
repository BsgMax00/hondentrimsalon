package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.*;
import be.thomasmore.hondentrimsalon.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EditController {
    //Customer edit
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/edit/Customer/{id}")
    public String Customer(Model model, @PathVariable(required = false)Integer id){

        Customer customer = customerRepository.findById(id).get();

        model.addAttribute("customer", customer);

        return "/edit/Customer";
    }

    @PostMapping("/edit/Customer/{id}")
    public String CustomerPost(Model model,
                               @PathVariable(required = false) Integer id,
                               @RequestParam String CustomerName,
                               @RequestParam String CustomerPhoneNumber,
                               @RequestParam String CustomerEmail,
                               @RequestParam String CustomerRegio){

        Customer customer = customerRepository.findById(id).get();

        customer.setName(CustomerName);
        customer.setPhoneNumber(CustomerPhoneNumber);
        customer.setEmail(CustomerEmail);
        customer.setRegio(CustomerRegio);

        customerRepository.save(customer);

        return "redirect:/CustomerList";
    }

    //Dog edit
    @Autowired
    private DogRepository dogRepository;

    @Autowired
    private BreedRepository breedRepository;

    @Autowired
    private FurRepository furRepository;

    @GetMapping("/edit/Dog/{id}")
    public String Dog(Model model, @PathVariable(required = false) Integer id){

        Dog dog = dogRepository.findById(id).get();
        Iterable<Breed> breeds = breedRepository.findAll();
        Iterable<Fur> furs = furRepository.findAll();

        model.addAttribute("dog", dog);
        model.addAttribute("breeds", breeds);
        model.addAttribute("furs", furs);

        return "/edit/Dog";
    }

    @PostMapping("/edit/Dog/{id}")
    public String DogPost(Model model,
                          @PathVariable(required = false) Integer id,
                          @RequestParam String DogName,
                          @RequestParam String DogGender,
                          @RequestParam String DogAge,
                          @RequestParam String DogInfo,
                          @RequestParam Breed DogBreed,
                          @RequestParam Fur DogFur){

        Dog dog = dogRepository.findById(id).get();

        dog.setName(DogName);
        dog.setGender(DogGender);
        dog.setAge(DogAge);
        dog.setExtraInfo(DogInfo);
        dog.setBreed(DogBreed);
        dog.setFur(DogFur);

        dogRepository.save(dog);

        return "redirect:/DogList";
    }

    //Product edit
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/edit/Product/{id}")
    public String Product(Model model, @PathVariable(required = false) Integer id){

        Product product = productRepository.findById(id).get();

        model.addAttribute("product", product);

        return "/edit/Product";
    }

    @PostMapping("edit/Product/{id}")
    public String ProductPost(Model model,
                              @PathVariable(required = false) Integer id,
                              @RequestParam String ProductName,
                              @RequestParam double ProductPrice){

        Product product = productRepository.findById(id).get();

        product.setProductName(ProductName);
        product.setPrice(ProductPrice);

        productRepository.save(product);

        return "redirect:/AboutUs";
    }
}

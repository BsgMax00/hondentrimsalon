package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.Customer;
import be.thomasmore.hondentrimsalon.model.Product;
import be.thomasmore.hondentrimsalon.repositories.BreedRepository;
import be.thomasmore.hondentrimsalon.repositories.CustomerRepository;
import be.thomasmore.hondentrimsalon.repositories.ProductRepository;
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
                               @RequestParam String CustomerPhoneNumber){

        Customer customer = customerRepository.findById(id).get();

        customer.setName(CustomerName);
        customer.setPhoneNumber(CustomerPhoneNumber);

        customerRepository.save(customer);

        return "redirect:/CustomerList";
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

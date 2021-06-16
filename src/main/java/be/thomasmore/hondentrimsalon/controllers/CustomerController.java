package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.Customer;
import be.thomasmore.hondentrimsalon.model.Dog;
import be.thomasmore.hondentrimsalon.repositories.CustomerRepository;
import be.thomasmore.hondentrimsalon.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DogRepository dogRepository;

    @GetMapping("/CustomerList")
    public String CustomerList(Model model){

        Iterable<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers", customers);

        return "CustomerList";
    }

    @GetMapping("/CustomerDetails/{id}")
    public String CustomerDetails(Model model, @PathVariable(required = false) Integer id){

        Customer customer = customerRepository.findById(id).get();
        model.addAttribute("customer", customer);

        return "CustomerDetails";
    }
}

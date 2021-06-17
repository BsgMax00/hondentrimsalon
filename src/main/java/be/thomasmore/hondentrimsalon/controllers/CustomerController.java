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
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Key;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DogRepository dogRepository;

    @GetMapping("/CustomerList/filter")
    public String CustomerListFilter(Model model,
                               @RequestParam(required = false) String keyword){

        Iterable<Customer> customers = customerRepository.findByFilter(keyword);

        model.addAttribute("customers", customers);
        model.addAttribute("showFilters", true);
        model.addAttribute("keyword", keyword);

        return "CustomerList";
    }

    @GetMapping("/CustomerDetails/{id}")
    public String CustomerDetails(Model model,
                                  @PathVariable(required = false) Integer id){

        Customer customer = customerRepository.findById(id).get();
        long longId = customerRepository.count();
        int lastId = (int) longId;

        model.addAttribute("customer", customer);
        model.addAttribute("prevIndex", prevIndex(id, lastId));
        model.addAttribute("nextIndex", nextIndex(id, lastId));

        return "CustomerDetails";
    }

    public int prevIndex(int currentindex, int lastID) {
        if (currentindex == 1) {
            currentindex = lastID;
        } else {
            currentindex -= 1;
        }
        return currentindex;
    }

    public int nextIndex(int currentindex, int lastId) {
        if (currentindex == lastId) {
            currentindex = 1;
        } else {
            currentindex += 1;
        }
        return currentindex;
    }
}

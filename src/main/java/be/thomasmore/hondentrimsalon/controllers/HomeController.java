package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.Employee;
import be.thomasmore.hondentrimsalon.model.Product;
import be.thomasmore.hondentrimsalon.repositories.EmployeeRepository;
import be.thomasmore.hondentrimsalon.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping({"/", "/Home"})
    public String Home(){
        return "Home";
    }

    @GetMapping("/AboutUs")
    public String Aboutus(Model model){

        Iterable<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);

        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("products", products);

        return "AboutUs";
    }
}

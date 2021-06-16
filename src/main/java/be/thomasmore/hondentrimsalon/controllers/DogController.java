package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.Dog;
import be.thomasmore.hondentrimsalon.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DogController {
    @Autowired
    private DogRepository dogRepository;

    @GetMapping("/DogList")
    public String DogList(Model model){

        Iterable<Dog> dogs = dogRepository.findAll();
        model.addAttribute("dogs", dogs);

        return "DogList";
    }

    @GetMapping("/DogDetails/{id}")
    public String DogDetails(Model model, @PathVariable(required = false) Integer id){

        Dog dog = dogRepository.findById(id).get();
        model.addAttribute("dog", dog);


        return "DogDetails";
    }
}

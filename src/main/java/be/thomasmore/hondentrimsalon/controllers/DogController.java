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
        long longId = dogRepository.count();
        int lastId = (int) longId;

        model.addAttribute("dog", dog);
        model.addAttribute("prevIndex", prevIndex(id, lastId));
        model.addAttribute("nextIndex", nextIndex(id, lastId));

        return "DogDetails";
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

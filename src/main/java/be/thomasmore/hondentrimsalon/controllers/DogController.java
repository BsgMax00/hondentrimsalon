package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.Breed;
import be.thomasmore.hondentrimsalon.model.Dog;
import be.thomasmore.hondentrimsalon.model.Fur;
import be.thomasmore.hondentrimsalon.repositories.BreedRepository;
import be.thomasmore.hondentrimsalon.repositories.DogRepository;
import be.thomasmore.hondentrimsalon.repositories.FurRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class DogController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(DogController.class);
    @Autowired
    private DogRepository dogRepository;

    @Autowired
    private BreedRepository breedRepository;

    @Autowired
    private FurRepository furRepository;

    @GetMapping("/DogList/filter")
    public String DogList(Model model,
                          @RequestParam(required = false) String keyword,
                          @RequestParam(required = false) String age,
                          @RequestParam(required = false) String breed,
                          @RequestParam(required = false) String fur){

        if(keyword == ""){
            keyword = null;
        }
        if(age == ""){
            age = null;
        }

        logger.info("keyword: " + keyword + ", breed: " + breed + ", fur: " + fur + ", age: " + age);

        Iterable<Dog> dogs = dogRepository.findByFilter(keyword, age, fur, breed);

        Iterable<Breed> breeds = breedRepository.findAll();
        Iterable<Fur> furs = furRepository.findAll();

        model.addAttribute("dogs", dogs);
        model.addAttribute("breeds", breeds);
        model.addAttribute("furs", furs);
        model.addAttribute("keyword", keyword);
        model.addAttribute("age", age);
        model.addAttribute("breedfilter", breed);
        model.addAttribute("furfilter", fur);

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

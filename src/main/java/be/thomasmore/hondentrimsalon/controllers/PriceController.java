package be.thomasmore.hondentrimsalon.controllers;

import be.thomasmore.hondentrimsalon.model.Breed;
import be.thomasmore.hondentrimsalon.repositories.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
public class PriceController {
    @Autowired
    private BreedRepository breedRepository;

    @GetMapping("/PriceList")
    public String PriceList(Model model){

        Iterable<Breed> breeds = breedRepository.findAll();
        model.addAttribute("breeds", breeds);

        return "PriceList";
    }

    @GetMapping("/PriceDetails/{id}")
    public String PriceDetails(Model model, @PathVariable(required = false) Integer id){

        Breed breed = breedRepository.findById(id).get();
        model.addAttribute("breed", breed);

        return "PriceDetails";
    }
}

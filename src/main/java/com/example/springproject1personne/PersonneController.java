package com.example.springproject1personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PersonneController {
    @Autowired
    PersonneService personneService;
    @GetMapping("/personne")
    public List<Personne> getPersonne(String id){
        return personneService.getPersonne();
    }
    @PostMapping("/personne")
    public void postPersonne(@RequestBody Personne personne){
        personneService.addPersonne(personne);


    }
    @PutMapping("/personne")
    public void editPersonne(@RequestBody Personne updatePersonne){

    }


}

package com.example.springproject1personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonneService {
    @Autowired
    PersonneRepository personneRepository;

    public List<Personne> getPersonne(){
       List<Personne> personne= personneRepository.findAll();
       return personne;
    }

    public void addPersonne(Personne personne){
        personneRepository.save(personne);
    }
}

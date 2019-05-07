package com.heaven.acronymlibrary.controllers;


import com.heaven.acronymlibrary.repository.AcronymRepository;
import com.heaven.acronymlibrary.models.Acronym;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/acronym")
public class AcronymController {
    @Autowired
    private AcronymRepository repository;


    /**
     *
     * @return all of the acronyms
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Acronym> getAllAcronyms() {
        return repository.findAll();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Acronym getAcronymById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/name/{acronymName}", method = RequestMethod.GET)
    public Acronym getAcronymByName(@PathVariable("acronymName") String name) {
        return repository.findByacronymName(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Acronym createAcronym(@Valid @RequestBody Acronym acronym) {
        //check if the acronym exists or not

        acronym.set_id(ObjectId.get());

        repository.save(acronym);

        return acronym;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteAcronym(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }



}

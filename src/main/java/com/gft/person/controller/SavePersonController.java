package com.gft.person.controller;

import com.gft.person.DBObjects.Person;
import com.gft.person.processors.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SavePersonController {
    private PersonService personService;

    public SavePersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/persons/", method = RequestMethod.POST)
    public Person savePerson(Person person){
        return personService.savePerson(person);
    }
}
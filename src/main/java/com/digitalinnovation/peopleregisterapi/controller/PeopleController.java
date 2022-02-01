package com.digitalinnovation.peopleregisterapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/v1/people")
public class PeopleController {
    @GetMapping String getBook(){
        return "Teste da API!";
    }
}

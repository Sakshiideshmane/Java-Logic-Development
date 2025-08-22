package com.example.demo.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {


//create todo
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){

        //create Todo

        return


    }

}

package com.example.Mini.Project;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class SimpleController {
  // RestTemplate
    DB db = new DB();
    // Get API
    @GetMapping("/hi")
    public String hello(){
        //System.out.println("Welcome");
        return "Hello";
    }

    // localhost:9000/search?q=Sachin
    // myownSerch/search?q=Sachin
    @GetMapping("/search")
    public String searchAWord(@RequestParam String word){

        return db.search(word);
    }

    // localhost:9000/read?id=2&name=Ramu
    @GetMapping("/read")
    public String searchAWord(@RequestParam String id,
                              @RequestParam String name){

        return "Hello "+ name + " "+ id;
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        //DB db = new DB();
        return db.getAllUsers();
    }
    @GetMapping("/users/{id}")
    //this a path param
    public User getAUser(@PathVariable int id){
        //DB db = new DB();
        return db.gerAUser(id);
    }
    //@ApiOperation(value = "To create/register a new user")
    @PostMapping("/users")
    //for post calls we need postman since no frontend now
    public boolean createAUser(@RequestBody User user){
       // DB db = new DB();
        return db.addAUser(user);
    }
    @DeleteMapping("/users/{id}")
    public boolean deleteAUser(@PathVariable int id){
       return db.deleteAUser(id);
    }
}

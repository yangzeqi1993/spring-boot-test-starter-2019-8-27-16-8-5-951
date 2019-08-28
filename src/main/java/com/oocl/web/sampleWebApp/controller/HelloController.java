package com.oocl.web.sampleWebApp.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HelloController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String greetingBad() {
        return "Hello World";
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody HashMap<String, String> getUserName(){
    	HashMap<String,String> map = new HashMap<String, String>();
    	map.put("id", "001");
    	return map;
    }
    
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody HashMap<String, String> createUserName(@RequestBody HashMap<String, String> map){
    	map.put("name", "yang");
    	return map;
    }

}

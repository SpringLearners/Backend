package com.learning.spring.presentation;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String method(@RequestParam(value="name", defaultValue = "World", required = false) String name,
                         @RequestParam(value = "pseudo", defaultValue = "", required = false) String pseudo) {
        return "Hello " + name + " " + pseudo;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String answerPost(@RequestBody String name) {
        return "Hello " + name;
    }

}

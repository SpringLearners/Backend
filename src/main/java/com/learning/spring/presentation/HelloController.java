package com.learning.spring.presentation;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

    @RequestMapping(path = "/post", method = RequestMethod.POST)
    public String answerPost(@RequestBody String name) {

        return "Hello " + name;
    }

    @RequestMapping(path = "/greetings", method = RequestMethod.GET)
    public String method(@RequestParam(value = "name", defaultValue = "World", required = false) String zmienna, @RequestParam(value = "", required = false) String zmienna2) {
        return "Hello " + zmienna + " " + zmienna2;
    }

}

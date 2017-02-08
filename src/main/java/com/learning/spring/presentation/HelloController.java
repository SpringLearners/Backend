package com.learning.spring.presentation;

import org.springframework.web.bind.annotation.*;

// TODO: Nie wrzucamy takich podpisów, usuwaj je
/**
 * Created by Beata Kalis on 2017-02-06.
 */

//TODO: Pomyśl czy nie da się czegoś w tej klasie ulepszyć, może @Request Mapping? :) 
@RestController
public class HelloController {

    @RequestMapping(value = "/hello/greetings", method = RequestMethod.GET)
    public String method(@RequestParam(value="name", defaultValue = "World", required = false) String name,
                         @RequestParam(value = "pseudo", defaultValue = "", required = false) String pseudo) {
        return "Hello " + name + " " + pseudo;
    }

    @RequestMapping(value = "/hello/post", method = RequestMethod.POST)
    public String answerPost(@RequestBody String name) {
        return "Hello " + name;
    }

}

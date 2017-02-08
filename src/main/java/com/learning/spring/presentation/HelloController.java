package com.learning.spring.presentation;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RestController
    public class MyController {

        @RequestMapping(path = "/hello/post", method = RequestMethod.POST)
        public String answerPost(@RequestBody String name) {

            return "Hello " + name;
        }

        @RequestMapping(path = "/hello/greetings", method = RequestMethod.GET)
        public String method(@RequestParam(value = "name", defaultValue = "World") String zmienna, @RequestParam(value = "name2", defaultValue = "World") String zmienna2) {
            return "Hello " + zmienna + " " + zmienna2;
        }

    }

}

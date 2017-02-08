package com.learning.spring.presentation;

import com.learning.spring.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/task/second", method = RequestMethod.POST)
    public String answerPost(@RequestBody User name) {
        return "Hello " + name.getFirstName() + " " + name.getLastName();
    }
}

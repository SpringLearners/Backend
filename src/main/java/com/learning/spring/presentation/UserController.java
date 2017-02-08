package com.learning.spring.presentation;

import com.learning.spring.business.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Beata Kalis on 2017-02-08.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/task/second", method = RequestMethod.POST)
    public String answerPost(@RequestBody User name) {
        return "Hello " + name.getFirstName() + " " + name.getLastName();
    }
}

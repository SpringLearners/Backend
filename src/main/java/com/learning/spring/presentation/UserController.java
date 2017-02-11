package com.learning.spring.presentation;

import com.learning.spring.business.UserService;
import com.learning.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable(name = "id") Integer id) {
        System.out.println("In");
        return userService.generateUser(id);
    }

}

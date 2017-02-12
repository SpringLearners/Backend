package com.learning.spring.presentation;

import com.learning.spring.business.UserService;
import com.learning.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable(name = "id") Integer id) {
        System.out.println("In");
        return userService.generateUser(id);
    }

    @RequestMapping(path = "/user/post", method = RequestMethod.POST)
    public User getUserPost(@RequestBody String id) {
        System.out.println("In post method");
        return userService.generateUser(Integer.parseInt(id));
    }

}

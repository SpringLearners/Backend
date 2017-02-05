package com.learn.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Crunchify.com
 *
 */

@Controller
public class HelloWorld {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

        return new ModelAndView("welcome", "message", "<h2>Hello World!</h2>");
    }
}

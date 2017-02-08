package com.learning.spring.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupriseController {

    @RequestMapping(path = "/task/second", method = RequestMethod.GET)
    public String method3(@RequestParam(value = "name", defaultValue = "1") String zmienna) {
        int repeat;
        try{
            repeat = Integer.parseInt(zmienna);
        }catch(NumberFormatException e){
            repeat =1;
        }
        String out = "l";

           for (int i = 0; i <= repeat; i++) {
               out += "o";
           }

        out += "ng word";
        return out;
    }
}

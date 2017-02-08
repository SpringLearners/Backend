package com.learning.spring.presentation;

import com.learning.spring.business.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping(path = "/calc")
    public Double average() {
        return gradeService.calculateAverage(Arrays.asList(4.0D, 4.5D, 5.0D));
    }
}

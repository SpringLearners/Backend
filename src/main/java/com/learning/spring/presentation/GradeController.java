package com.learning.spring.presentation;

import com.learning.spring.business.GradeService;
import com.learning.spring.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping(path = "/average")
    public Double average() {
        return gradeService.calculateAverage(Arrays.asList(new Grade(1, "AK", 5, 5D), new Grade(2, "AK2", 5, 4.5)));
    }

    @RequestMapping(path = "/min")
    public Grade minGrade() {
        return gradeService.findMinGrade(Arrays.asList(new Grade(1, "AK", 5, 5D), new Grade(2, "AK2", 5, 4.5)));
    }

    @RequestMapping(path = "/max")
    public Grade maxGrade() {
        return gradeService.findMaxGrade(Arrays.asList(new Grade(1, "AK", 5, 5D), new Grade(2, "AK2", 5, 4.5)));
    }

    @RequestMapping(path = "/sortGrades")
    public List<Grade> sortGrades() {
        return gradeService.sortGrades(Arrays.asList(new Grade(1, "AK", 5, 5D), new Grade(2, "SO", 4, 4D),
                new Grade(3, "AK2", 5, 4.5)));
    }

}

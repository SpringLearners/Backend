package com.learning.spring.presentation;

import com.learning.spring.business.StudentService;
import com.learning.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private List<Student> students = Arrays.asList(new Student("Kowalski",
            new ArrayList<>(), 5.0, 1), new Student("Kontek Grzesiek",
            new ArrayList<>(), 5.5, 2), new Student("Nowak",
            new ArrayList<>(), 4.67, 3));

    @RequestMapping(path = "/sortByAverage")
    public List<Student> sortByAverage() {
        return studentService.sortByAverage(students);
    }

    @RequestMapping(path = "/sortByName")
    public List<Student> sortByName() {
        return studentService.sortByName(students);
    }

    @RequestMapping(path = "/findBestStudent")
    public Student findBestStudent() {
        return studentService.findBestStudent(students);
    }
}

package com.learning.spring.entity;

import java.util.List;

public class Student {

    private Integer id;
    private String name;
    private List<Grade> grades;
    private Double average;

    public Student(String name, List<Grade> grades, Double average, Integer id) {
        this.name = name;
        this.grades = grades;
        this.average = average;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public Double getAverage() {
        return average;
    }
}

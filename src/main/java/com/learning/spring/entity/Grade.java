package com.learning.spring.entity;


public class Grade {

    private Integer id;
    private String subject;
    private Integer weight;
    private Double grade;

    public Grade(Integer id, String subject, Integer weight, Double grade) {
        this.id = id;
        this.subject = subject;
        this.weight = weight;
        this.grade = grade;
    }

    public Integer getWeight() {
        return weight;
    }

    public Double getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getId() {
        return id;
    }

}

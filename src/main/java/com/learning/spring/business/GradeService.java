package com.learning.spring.business;

import com.learning.spring.entity.Grade;

import java.util.List;

public interface GradeService {

    Double calculateAverage(List<Grade> grades);

    Grade findMinGrade(List<Grade> grade);

    Grade findMaxGrade(List<Grade> grade);

    List<Grade> sortGrades(List<Grade> grades);

    int addGrade(Grade grade);

    int updateGrade(Grade grade);

    Grade getGrade(Integer id);

    int deleteGrade(Integer id);

}

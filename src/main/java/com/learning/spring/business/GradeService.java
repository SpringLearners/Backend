package com.learning.spring.business;

import com.learning.spring.entity.Grade;

import java.util.List;

public interface GradeService {

    Double calculateAverage(List<Grade> grades);

    Grade findMinGrade(List<Grade> grade);

    Grade findMaxGrade(List<Grade> grade);

    List<Grade> sortGrades(List<Grade> grades);

}

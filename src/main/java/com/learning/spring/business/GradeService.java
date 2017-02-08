package com.learning.spring.business;

import java.util.List;

public interface GradeService {

    public Double calculateAverage(List<Double> grades);

    public Double findMinGrade(List<Double> grade);

    public Double findMaxGrade(List<Double> grade);
}

package com.learning.spring.business.impl;

import com.learning.spring.business.GradeService;
import com.learning.spring.entity.Grade;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GradeServiceImpl implements GradeService {

    @Override
    public Double calculateAverage(List<Grade> grades) {
        if (CollectionUtils.isEmpty(grades)) {
            return 0D;
        }

        double sum = grades.stream().mapToDouble(x -> x.getGrade() * x.getWeight()).sum();
        int weights = grades.stream().mapToInt(x -> x.getWeight()).sum();

        return sum / weights;
    }

    @Override
    public Grade findMinGrade(List<Grade> grades) {
        if (CollectionUtils.isEmpty(grades)) {
            return null;
        }

        return grades.stream().min((o1, o2) -> o1.getGrade().compareTo(o2.getGrade())).get();
    }

    @Override
    public Grade findMaxGrade(List<Grade> grades) {
        if (CollectionUtils.isEmpty(grades)) {
            return null;
        }

        return grades.stream().max((o1, o2) -> o1.getGrade().compareTo(o2.getGrade())).get();
    }

    @Override
    public List<Grade> sortGrades(List<Grade> grades) {
        if (CollectionUtils.isEmpty(grades)) {
            return null;
        }
        return grades.stream().sorted((o1, o2) -> o1.getGrade().compareTo(o2.getGrade())).collect(Collectors.toList());
    }
}

package com.learning.spring.business.impl;

import com.learning.spring.business.GradeService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Override
    public Double calculateAverage(List<Double> grades) {
        if (CollectionUtils.isEmpty(grades)) {
            return 0D;
        }

        return grades.stream().mapToDouble(Double::doubleValue).sum() / grades.size();
    }

    @Override
    public Double findMinGrade(List<Double> grades) {
        if (CollectionUtils.isEmpty(grades)) {
            return 0D;
        }

        return grades.stream().min((o1, o2) -> o1.compareTo(o2)).get();
    }

    @Override
    public Double findMaxGrade(List<Double> grades) {
        if (CollectionUtils.isEmpty(grades)) {
            return 0D;
        }

        return grades.stream().max((o1, o2) -> o1.compareTo(o2)).get();
    }
}

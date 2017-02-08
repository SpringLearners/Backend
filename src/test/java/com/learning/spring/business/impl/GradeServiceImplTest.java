package com.learning.spring.business.impl;

import com.learning.spring.business.GradeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GradeServiceImplTest {

    private GradeService gradeService = new GradeServiceImpl();

    private List<Double> grades;

    @Before
    public void setUp() throws Exception {
        grades = Arrays.asList(4.0D, 4.5D, 5.0D);
    }

    @Test
    public void shouldInjectDependency() {
        assertNotNull(gradeService);
    }

    @Test
    public void calculateAverage() throws Exception {

        // given
        Double expectedAverage = 4.5D;

        // when
        Double average = gradeService.calculateAverage(grades);

        // then
        assertEquals(expectedAverage, average);

    }

    @Test
    public void findMinGrade() throws Exception {

        // given
        Double expectedMin = 4.0D;

        // when
        Double grade = gradeService.findMinGrade(grades);

        // then
        assertEquals(expectedMin, grade);
    }

    @Test
    public void findMaxGrade() throws Exception {

        // given
        Double expectedMax = 5.0D;

        // when
        Double grade = gradeService.findMaxGrade(grades);

        // then
        assertEquals(expectedMax, grade);
    }

}
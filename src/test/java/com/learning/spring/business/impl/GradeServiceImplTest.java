package com.learning.spring.business.impl;

import com.learning.spring.business.GradeService;
import com.learning.spring.entity.Grade;
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

    private List<Grade> grades;

    @Before
    public void setUp() throws Exception {
        grades = Arrays.asList(new Grade(1, "AK", 5, 5D), new Grade(2, "SO", 5, 4D),
                new Grade(3, "AK2", 5, 4.5));
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
        Grade grade = gradeService.findMinGrade(grades);

        // then
        assertEquals(expectedMin, grade.getGrade());
    }

    @Test
    public void findMaxGrade() throws Exception {

        // given
        Double expectedMax = 5.0D;

        // when
        Grade grade = gradeService.findMaxGrade(grades);

        // then
        assertEquals(expectedMax, grade.getGrade());
    }

    @Test
    public void sortGrades() throws Exception {

        // given
        List<Grade> expectedGrades = Arrays.asList(new Grade(2, "SO", 5, 4D), new Grade(3, "AK2", 5, 4.5),
                new Grade(1, "AK", 5, 5D));

        // when
        List<Grade> gradesResult = gradeService.sortGrades(grades);

        // then
        assertEquals(expectedGrades.get(0).getGrade(), gradesResult.get(0).getGrade());
    }

}
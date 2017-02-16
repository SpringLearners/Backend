package com.learning.spring.business.impl;

import com.learning.spring.business.StudentService;
import com.learning.spring.entity.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceImplTest {

    private StudentService studentService = new StudentServiceImpl();

    private List<Student> students;

    @Before
    public void setUp() throws Exception {
        students = Arrays.asList(new Student("Kowalski",
                new ArrayList<>(), 5.0, 1), new Student("Kontek Grzesiek",
                new ArrayList<>(), 5.5, 2), new Student("Nowak",
                new ArrayList<>(), 4.67, 3));
    }

    @Test
    public void shouldInjectDependency() {
        assertNotNull(studentService);
    }

    @Test
    public void sortByAverage() throws Exception {

        // given
        List<Student> studentsExpected = Arrays.asList(new Student("Nowak",
                new ArrayList<>(), 4.67, 3), new Student("Kowalski",
                new ArrayList<>(), 5.0, 1), new Student("Kontek Grzesiek",
                new ArrayList<>(), 5.5, 2));

        // when
        List<Student> studentsResult = studentService.sortByAverage(students);

        // then
        assertEquals(studentsExpected.get(0).getAverage(), studentsResult.get(0).getAverage());

    }

    @Test
    public void sortByName() throws Exception {

        // given
        List<Student> studentsExpected = Arrays.asList(new Student("Kontek Grzesiek",
                new ArrayList<>(), 5.5, 2), new Student("Kowalski",
                new ArrayList<>(), 5.0, 1), new Student("Nowak",
                new ArrayList<>(), 4.67, 3));

        // when
        List<Student> studentsResult = studentService.sortByName(students);

        // then
        assertEquals(studentsExpected.get(0).getName(), studentsResult.get(0).getName());

    }

    @Test
    public void findBestStudent() throws Exception {

        // given
        List<Student> studentExpected = Collections.singletonList(new Student("Kontek Grzesiek", new ArrayList<>(), 5.5, 1));


        // when
        List<Student> studentResult = studentService.findBestStudent(students);

        // then
        assertEquals(studentExpected.get(0).getName(), studentResult.get(0).getName());

    }

}

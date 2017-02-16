package com.learning.spring.business;


import com.learning.spring.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> sortByAverage(List<Student> students);

    List<Student> sortByName(List<Student> students);

    List<Student> findBestStudent(List<Student> students);

}

package com.learning.spring.business.impl;

import com.learning.spring.business.StudentService;
import com.learning.spring.entity.Student;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> sortByAverage(List<Student> students) {
        if (CollectionUtils.isEmpty(students)) {
            return null;
        }

        return students.stream().sorted((o1, o2) -> o1.getAverage().compareTo(o2.getAverage())).collect(Collectors.toList());
    }

    @Override
    public List<Student> sortByName(List<Student> students) {
        if (CollectionUtils.isEmpty(students)) {
            return null;
        }

        return students.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
    }

    @Override
    public Student findBestStudent(List<Student> students) {
        if (CollectionUtils.isEmpty(students)) {
            return null;
        }

        return students.stream().max((o1, o2) -> o1.getAverage().compareTo(o2.getAverage())).get();
    }
}

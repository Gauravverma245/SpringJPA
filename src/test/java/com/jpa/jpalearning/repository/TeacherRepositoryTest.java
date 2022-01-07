package com.jpa.jpalearning.repository;

import com.jpa.jpalearning.entity.Course;
import com.jpa.jpalearning.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository repository;

    @Test
    public void saveTeacher(){
        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(6)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Gaurav")
                .lastName("verma")
                .courses(List.of(courseDBA, courseJava))
                .build();

        repository.save(teacher);
    }

}
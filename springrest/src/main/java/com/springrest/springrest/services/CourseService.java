package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService{
    public List<Course> getCourses();
    public Course getCourse(Long courseID);

    public Course addCourse(Course course);

    public Course updateCourse(Course updatedCourse);

    public void deleteCourse(long courseID);
}

package com.springrest.springrest.controller.MyController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    //----Welcome page---
    @GetMapping("/home")
    public String Home(){
        return "Welcome to courses application";
    }


    // Get ALL courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    // Insert a Course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    //Update Course
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course updatedCourse){
        return courseService.updateCourse(updatedCourse);
    }

    // GET course using courseID;
    @GetMapping("/courses/{courseID}")
    public Course getcourse(@PathVariable String courseID){
        return courseService.getCourse(Long.parseLong(courseID));
    }

    // Delete Course;
    @DeleteMapping("/courses/{courseID}")
    public void deleteCourse(@PathVariable long courseID){
        courseService.deleteCourse(courseID);
    }

}

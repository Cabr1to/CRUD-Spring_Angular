package com.cabrito.controller;

import com.cabrito.model.Course;
import com.cabrito.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor

public class CoursesController {


    private final CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> list(){

        return courseRepository.findAll();

    }


}
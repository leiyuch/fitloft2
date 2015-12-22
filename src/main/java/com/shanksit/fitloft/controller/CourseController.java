package com.shanksit.fitloft.controller;

import com.shanksit.fitloft.domain.Course;
import com.shanksit.fitloft.domain.User;
import com.shanksit.fitloft.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by leiyuch on 15/12/10.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Controller
public class CourseController extends BaseController {

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping("getCourseByUser")
    public
    @ResponseBody
    List getCourseByUser(@RequestBody User user) {
        List list = courseRepository.getCourseByUser (user.getUser_id ());
        return list;
    }

    @RequestMapping("getCourseByid")

    public  @ResponseBody
    Course getCourseByid(@RequestBody Course course){
        return   courseRepository.getCourseByid(course.getCourse_id ());
    }
}

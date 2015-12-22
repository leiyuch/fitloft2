package com.shanksit.fitloft.repository;

import com.shanksit.fitloft.domain.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leiyuch on 15/12/10.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

    @Query("select c from Course c where c.user.user_id = ?1")
    public List getCourseByUser(int user_id);
    @Query("select c from Course c where c.course_id = ?1")
    public  Course getCourseByid(int id);
}

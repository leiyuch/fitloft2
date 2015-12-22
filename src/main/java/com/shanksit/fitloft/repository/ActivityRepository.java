package com.shanksit.fitloft.repository;

import com.shanksit.fitloft.domain.ActivityDetail;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leiyuch on 15/12/18.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Repository
public interface ActivityRepository extends CrudRepository<ActivityDetail,Long> {

    @Query("SELECT activity from ActivityDetail activity order by activity.activity_id desc ")
    public List<ActivityDetail> getActivity(Pageable pageable);
    @Query("SELECT activity from ActivityDetail activity where   activity.activity_id  = ?1 ")
    public  ActivityDetail getActivityByid(int id);
}

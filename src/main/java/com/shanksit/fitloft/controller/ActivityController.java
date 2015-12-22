package com.shanksit.fitloft.controller;

import com.shanksit.fitloft.domain.ActivityDetail;
import com.shanksit.fitloft.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by leiyuch on 15/12/18.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Controller
public class ActivityController extends  BaseController {

    @Autowired
    ActivityRepository repository;
    @RequestMapping("getActivity")
    public @ResponseBody List<ActivityDetail> getActivity(){
        Pageable topTen = new PageRequest (0, 100);
        return repository.getActivity (topTen);
    }
    @RequestMapping("getActivityById")
    public  @ResponseBody ActivityDetail getActivityByid(@RequestBody ActivityDetail activityDetail){

        return repository.getActivityByid (activityDetail.getActivity_id ());
    }
}

package com.shanksit.fitloft.controller;

import com.shanksit.fitloft.domain.ActivityBooking;
import com.shanksit.fitloft.domain.ActivityDetail;
import com.shanksit.fitloft.repository.ActivityBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by leiyuch on 15/12/21.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Controller
public class ActivityBookingController extends BaseController {


    @Autowired
    ActivityBookingRepository repository;


    @RequestMapping("getActivityBookingById")
    public
    @ResponseBody
    List<ActivityBooking> getBookingByid(@RequestBody ActivityDetail activityDetail) {
        return repository.getBookingByid (activityDetail.getActivity_id ());
    }

    @RequestMapping("saveBooking")
    public
    @ResponseBody
    String saveBooking(@RequestBody ActivityBooking activityBooking) {
        repository.save (activityBooking);
        return "success";
    }

    @RequestMapping("getActivityBooking")

    public @ResponseBody ActivityBooking getActivity(@RequestBody ActivityBooking activityBooking){

        return  repository.getActivity (activityBooking.getActivityDetail ().getActivity_id (),activityBooking.getUser ().getUser_id ());
    }

}

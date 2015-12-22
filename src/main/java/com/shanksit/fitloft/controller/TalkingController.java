package com.shanksit.fitloft.controller;

import com.shanksit.fitloft.domain.Talking;
import com.shanksit.fitloft.repository.TalkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by leiyuch on 15/12/12.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Controller
public class TalkingController  extends  BaseController{

    @Autowired
    TalkingRepository repository;


    @RequestMapping(value = "saveTalking", produces = "text/html;charset=UTF-8")
    public  @ResponseBody
    String saveTalking(@RequestBody Talking talking)
    {
        logger.error (talking.getTalking_content ());
        repository.save (talking);
        return  "success";
    }


    /**
    @RequestMapping(value = "TalkingList")
    public      @ResponseBody
    Page<Talking> getEntryByPageable(@PageableDefault(value = 500, sort = {"talkingId"}, direction = Sort.Direction.DESC)
                                            Pageable pageable) {
        return repository.findAll (pageable);
    }
**/

   // public  @ResponseBody List get


    @RequestMapping(value = "TalkingList")
    public      @ResponseBody
    List<Talking> getTalkingList() {

        Pageable topTen = new PageRequest (0, 500);
        return repository.findAllTalkinlist(topTen);
    }


    @RequestMapping("findTalkingById")

    public  @ResponseBody

    Talking findTalkingById(@RequestBody Talking talking){

        return  repository.findTalkingById (talking.getTalking_id ());
    }

    @RequestMapping("updateReviewnum")

    public  @ResponseBody String updateReviewnum(@RequestBody Talking talking)
    {
        repository.updateReviewnum (talking.getLike_num (),talking.getReview_num (),talking.getTalking_id ());

        return  "success";
    }
}

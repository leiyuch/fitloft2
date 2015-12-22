package com.shanksit.fitloft.controller;

import com.shanksit.fitloft.domain.Review;
import com.shanksit.fitloft.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ReviewController extends  BaseController {

    @Autowired
    ReviewRepository repository;

    @RequestMapping("saveReview")
    public  @ResponseBody String saveReview(@RequestBody Review review){

        repository.save (review);
        return  "success";
    }

  @RequestMapping("getReviewsByTalking")

    public @ResponseBody
  List<Review> getRivewsByTalking(@RequestBody Review review){

    return  repository.getRivewsByTalking (review.getTalking ().getTalking_id (),review.getReview_like ());
  }


    @RequestMapping("deleteReviewByID")

    public @ResponseBody String deleteReviewByID(@RequestBody Review review){
        logger.error (review.getTalking ().getTalking_id ()+"");
        logger.error (review.getReviewUser ().getUser_id ()+"");
        logger.error (review.getReview_like ()+"");
        repository.deleteReview (review.getTalking ().getTalking_id (),review.getReviewUser ().getUser_id (),review.getReview_like ());
        return "success";
    }
}

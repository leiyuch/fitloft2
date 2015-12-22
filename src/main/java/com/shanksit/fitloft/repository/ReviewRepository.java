package com.shanksit.fitloft.repository;

import com.shanksit.fitloft.domain.Review;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by leiyuch on 15/12/12.
 * 在我陨落的地方 天空闪耀着光芒
 */
public interface ReviewRepository extends CrudRepository<Review,Long> {

    @Query("select  review from  Review  review where review.talking.talking_id= ?1 " +
            "and  review.review_like= ?2 order by review_id DESC ")
    public List<Review> getRivewsByTalking(int talking_id,String review_like);

    @Transactional
    @Modifying
    @Query("delete   from Review  review where review.talking.talking_id= ?1 and review.reviewUser.user_id= ?2 " +
            "and review.review_like= ?3")
    public void deleteReview(int talking_id,int user_id,String review_like);
}

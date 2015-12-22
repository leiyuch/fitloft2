package com.shanksit.fitloft.repository;

import com.shanksit.fitloft.domain.Talking;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by leiyuch on 15/12/12.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Repository
public interface TalkingRepository extends CrudRepository<Talking,Long> {

    //List  aaa();
    @Query("select u from Talking u order by  talking_id desc ")
   List<Talking> findAllTalkinlist( Pageable pageable);
    @Query("select u from Talking u where u.talking_id = ?1")
    public  Talking findTalkingById(int id);
    @Transactional
    @Modifying
    @Query(value = "update Talking talking set talking.like_num = ?1 , talking.review_num= ?2 where talking.talking_id= ?3")
    public  void updateReviewnum(int like_num,int review_num,int talking_id);
}

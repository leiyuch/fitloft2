package com.shanksit.fitloft.repository;

import com.shanksit.fitloft.domain.ActivityBooking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leiyuch on 15/12/21.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Repository
public interface ActivityBookingRepository  extends CrudRepository<ActivityBooking,Long> {
    @Query("select  booking from  ActivityBooking booking where booking.activityDetail.activity_id = ?1")
    List<ActivityBooking> getBookingByid( int activity_id);

   @Query("select  booking from  ActivityBooking booking where booking.activityDetail.activity_id = ?1 and booking.user.user_id= ?2")
    ActivityBooking getActivity(int activity_id,int user_id);
}

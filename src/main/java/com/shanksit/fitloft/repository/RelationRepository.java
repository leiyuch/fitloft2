package com.shanksit.fitloft.repository;

import com.shanksit.fitloft.domain.Relation;
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
public interface RelationRepository extends CrudRepository<Relation,Long> {
    @Query("select  relation  from  Relation relation where  relation.sub_user.user_id= ?1")
    public List<Relation> getPriUser(int subuser_id);

    @Query("select  relation  from  Relation relation where  relation.pri_user.user_id= ?1")
    public List<Relation> getSubUser(int subuser_id);

    @Transactional
    @Modifying
    @Query("delete  from  Relation relation where  relation.pri_user.user_id= ?1 and " +
            " relation.sub_user.user_id= ?2")
    public  void deleteRelation(int preuser_id,int subuser_id);
}

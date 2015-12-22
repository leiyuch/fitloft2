package com.shanksit.fitloft.controller;

import com.shanksit.fitloft.domain.Relation;
import com.shanksit.fitloft.repository.RelationRepository;
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
public class RelationController extends  BaseController {
    @Autowired
    RelationRepository repository;

    @RequestMapping("saveRelation")

    public  @ResponseBody String saveRealtion(@RequestBody Relation relation){
        repository.save (relation);
        return "success";
    }

    @RequestMapping("getPriUser")

    public  @ResponseBody
    List<Relation> getPriUser(@RequestBody Relation relation){


        return  repository.getPriUser (relation.getSub_user ().getUser_id ());
    }

    @RequestMapping("getSubUser")
    public  @ResponseBody
    List<Relation> getSubUser(@RequestBody Relation relation){


        return  repository.getPriUser (relation.getPri_user ().getUser_id ());
    }

    //delte

    @RequestMapping("deleteRelation")
    public @ResponseBody String  deleteRelation(@RequestBody Relation relation){

        repository.deleteRelation (relation.getPri_user ().getUser_id (),relation.getSub_user ().getUser_id ());
        return "success";
    }
}

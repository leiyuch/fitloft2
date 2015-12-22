package com.shanksit.fitloft.controller;

import com.qiniu.util.Auth;
import com.shanksit.fitloft.domain.MessageEntity;
import com.shanksit.fitloft.domain.Token;
import com.shanksit.fitloft.domain.User;
import com.shanksit.fitloft.repository.UserRepository;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.request.CloudpushMessageIosRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import com.taobao.api.response.CloudpushMessageIosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by chenleiyu on 15/12/1.
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    UserRepository userRepository;

    //注册用户
    @RequestMapping(value = "reg", method = RequestMethod.POST, consumes = "application/json")
    public
    @ResponseBody
    String saveUser(@RequestBody User user) {
        userRepository.save (user);
        return "okay";
    }

    //用户登录
    public
    @ResponseBody
    boolean userAuth(@RequestBody User user) {
        boolean result = true;
        if (userRepository.auth (user.getUser_name (), user.getUser_pwd ()).size () > 0) {
            result = false;
        }
        return result;
    }

    //findUserbyName
    @RequestMapping("findUserByname")
    public
    @ResponseBody
    User findByuserName(@RequestBody User uesr) {
        User user = userRepository.getUserByUserName (uesr.getUser_name ());
        return user;
    }


    @RequestMapping("getUserBylevel")
    public
    @ResponseBody
    List findUserByLevel(@RequestBody User user) {
        List list = userRepository.findUserByLevelAndUserType (user.professional_ratings, user.getUser_type ());
        return list;
    }
    //用户列表

    /**
     * page，第几页，从0开始，默认为第0页
     * size，每一页的大小，默认为15
     * sort，排序相关的信息，以property,property(,ASC|DESC)的方式组织，例如sort=firstname&sort=lastname,desc表示在按firstname正序排列基础上按lastname倒序排列
     * 这样，我们就可以通过url的参数来进行多样化、个性化的查询，而不需要为每一种情况来写不同的方法了。
     */
    @RequestMapping(value = "UserList")
    public Page<User> getEntryByPageable(@PageableDefault(value = 15, sort = {"id"}, direction = Sort.Direction.DESC)
                                         Pageable pageable) {

        return userRepository.findAll (pageable);
    }

    @RequestMapping("sendSms")
    public
    @ResponseBody
    String SendSms(@RequestBody Map number) {
        String temp =  getRandomNumber();
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest ();
        req.setExtend ("123456");
        req.setSmsType ("normal");
        req.setSmsFreeSignName ("健身工坊");
        req.setSmsParamString ("{\"code\":" + "\"" +temp + "\",\"product\":\"健身工坊\"}");
        req.setRecNum (number.get ("number").toString ());
        req.setSmsTemplateCode ("SMS_3075317");
        AlibabaAliqinFcSmsNumSendResponse rsp = null;
        try {
            rsp = client.execute (req);
        } catch (ApiException e) {
            e.printStackTrace ();
        }

        return temp;
    }

    @RequestMapping("qiniuAuth")
    public
    @ResponseBody
    Token qiuniuAuth(@RequestBody Token token){
        Auth auth  = Auth.create ("lyqTrEJPDSNw1doqwGgANUZuCR2-wljghRLYTjIQ","VUodrDS_n0WBtlHa6Ti70fq-po5nBApvwdfKf8fE");
        token.setToken (auth.uploadToken("shao8888"));
        return token;
    }

    //获得推荐的用户

    @RequestMapping("getUsersByrecommend")

    public  @ResponseBody List<User> getUersByrecommend(){
        return  userRepository.getUersByrecommend ();
    }


    //push

    @RequestMapping("pushMessage")
    public @ResponseBody String pushMessage(@RequestBody MessageEntity messageEntity){
        TaobaoClient client1 = new DefaultTaobaoClient ("http://gw.api.taobao.com/router/rest", "23286722", "71291ecf0164f8da71b5de05a1222f73");
        CloudpushMessageIosRequest req = new CloudpushMessageIosRequest();
        req.setBody(messageEntity.getMessage_content ());
        req.setTarget("device");
        req.setTargetValue (messageEntity.getReceived_user ().getDevice_id ());
        CloudpushMessageIosResponse rsp = null;
        try {
            rsp = client1.execute(req);
        } catch (ApiException e) {
            e.printStackTrace ();
        }
        return  rsp.getBody();
    }


    @RequestMapping("index")
    public  String index(){
        logger.error ("this is my test");
        return  "leo.jsp";
    }
}
package com.shanksit.fitloft.controller;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

/**
 * Created by leiyuch on 15/12/7.
 * 在我陨落的地方 天空闪耀着光芒
 */
@Controller
@RequestMapping("/fitloft")
public class BaseController
{
    protected   final Logger logger = LoggerFactory.getLogger(this.getClass ());

    TaobaoClient client = new DefaultTaobaoClient ("http://gw.api.taobao.com/router/rest", "23283077", "888e4db39084b77b732d66b86c8d2783");

    static Random rnd = new Random ();

    public static  String getRandomNumber() {
        StringBuilder sb = new StringBuilder(4);
        for(int i=0; i < 4; i++)
            sb.append((char)('0' + rnd.nextInt(10)));
        return sb.toString();
    }


}


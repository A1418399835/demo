package com.example.demo.web;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.biz.IUserBiz;
import com.example.demo.entity.Userinfo;
import com.example.demo.util.PortUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hmg")
public class FirstAction{

    @Autowired
    private IUserBiz userBizImpl;

    @ResponseBody
    @RequestMapping(value = "hello.mvc",produces = MediaType.APPLICATION_JSON_VALUE +";charset=UTF-8")
    public JSONObject register(
            @RequestParam("realname") String name,
            @RequestParam("sex") String sex,
            @RequestParam("mobile") String mobile,
            @RequestParam("yzm") String yzm,
            @RequestParam("school") String school,
            @RequestParam("banji") String banji,
            @RequestParam("course") String course
    ) {//?realname=&sex=&mobile=&yzm=&school=&banji=&course=
        JSONObject json =new JSONObject();
        System.out.println("realname=" + name);
        System.out.println("sex=" + sex);
        System.out.println("mobile=" + mobile);
        System.out.println("yzm=" + yzm);
        System.out.println("school=" + school);
        System.out.println("banji=" + banji);
        System.out.println("course=" + course);
        json.put("code",0);//业务状态码
        json.put("msg","success");

        Userinfo user =new Userinfo();
        user.setRealname(name);
        user.setSex(sex.equals("男"));
        user.setMobile(mobile);
        user.setSchool(1);
        user.setBanji(1);
        user.setCourse(course);


        //将string类型转换成int型数据
        int sid = 0;
        try{
            sid =Integer.parseInt(school);
        }catch(NumberFormatException e){
            json.put("code",10002);
            json.put("msg",PortUtil.getValue(10002));
            return json;
        }
        int bid = 0;
        try{
            bid = Integer.parseInt(banji);
        }catch (NumberFormatException e){
            json.put("code",10003);
            json.put("msg",PortUtil.getValue(10003));
            return json;
        }

        int r= userBizImpl.add(user);
        json.put("code",r);
        json.put("msg", PortUtil.getValue(r));
        return json;



    }
}

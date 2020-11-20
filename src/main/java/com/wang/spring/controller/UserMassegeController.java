package com.wang.spring.controller;

import com.wang.spring.pojo.UserMassege;
import com.wang.spring.service.UserMassegeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/User")
public class UserMassegeController {

    @Resource
    private UserMassegeService userMassegeService;

    @RequestMapping(value = "/Signin", method = RequestMethod.POST)
    @ResponseBody
    public String  Singin(@RequestBody UserMassege userMassege) throws Exception{    //登录

        String name = userMassege.getUsername();
        String password = userMassege.getPassword();
        System.out.println(name);
        System.out.println(password);
//        String token= TokenUtil.sign(user);
        String  test=userMassegeService.checklogin(name,password);
        if (test=="correct"){
            return test;
        }else {
            return "false";
        }
    }

}

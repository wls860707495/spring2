package com.wang.spring.controller;

import com.wang.spring.pojo.UserMassege;
import com.wang.spring.service.UserMassegeService;

import com.wang.spring.util.TokenUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/User")
public class UserMassegeController {

    @Resource
    private UserMassegeService userMassegeService;

    @RequestMapping(value = "/Signin", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject Singin(@RequestBody UserMassege userMassege) throws Exception{    //登录
        Map<String,String> temp=new HashMap<>();
        String name = userMassege.getUsername();
        String password = userMassege.getPassword();
        String token= TokenUtil.sign(userMassege);
        temp.put("name",name);
        temp.put("password",password);
        temp.put("token",token);
        JSONObject json = JSONObject.fromObject(temp);;
        String  test=userMassegeService.checklogin(name,password);
        if (test=="correct"){
            return json;
        }else {
            return null;
        }
    }

}

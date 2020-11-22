package com.wang.spring.controller;

import com.wang.spring.pojo.ClinicMassege;
import com.wang.spring.pojo.UserMassege;
import com.wang.spring.service.ClinicMassegeService;
import com.wang.spring.service.UserMassegeService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/Clinic")
public class ClinicMassegeController {

    @Resource
    private ClinicMassegeService clinicMassegeService;
    @Resource
    private UserMassegeService userMassegeService;
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String  Singin(@RequestBody JSONObject jsonParam) throws Exception{    //登录
        String jo = jsonParam.toString();
        System.out.println(jo);

        UserMassege user = new UserMassege();
        ClinicMassege clinic = new ClinicMassege();
        String username = jsonParam.get("username").toString();
        String password = jsonParam.get("password").toString();
        String type = jsonParam.get("type").toString();
        String clinic_name = jsonParam.get("clinic_name").toString();
        String clinic_email = jsonParam.get("clinic_email").toString();
        String clinic_tel = jsonParam.get("clinic_tel").toString();
        String clinic_type = jsonParam.get("clinic_type").toString();
        String clinic_head = jsonParam.get("clinic_head").toString();
        String head_tel = jsonParam.get("head_tel").toString();
        String head_email = jsonParam.get("head_email").toString();
        String bank_name = jsonParam.get("bank_name").toString();
        String regis_num = jsonParam.get("regis_num").toString();
        String bank_branch = jsonParam.get("bank_branch").toString();
        String bank_accout = jsonParam.get("bank_accout").toString();
        String accout_name = jsonParam.get("accout_name").toString();


        user.setUsername(username);
        user.setPassword(password);
        user.setType(type);
        userMassegeService.insertUsermassege(user);
        UserMassege user2 = userMassegeService.getUsermassegeByusername(username);
        int userid = user2.getUserid();

        clinic.setUserid(userid);
        clinic.setAccout_name(accout_name);
        clinic.setBank_accout(bank_accout);
        clinic.setBank_branch(bank_branch);
        clinic.setBank_name(bank_name);
        clinic.setClinic_email(clinic_email);
        clinic.setClinic_head(clinic_head);
        clinic.setClinic_name(clinic_name);
        clinic.setClinic_tel(clinic_tel);
        clinic.setClinic_type(clinic_type);
        clinic.setHead_email(head_email);
        clinic.setHead_tel(head_tel);
        clinic.setRegis_num(regis_num);

        clinicMassegeService.insertClinicmassege(clinic);



        return "false";
    }
}

package com.wang.spring.controller;

import com.wang.spring.pojo.PushMassege;
import com.wang.spring.pojo.UserMassege;
import com.wang.spring.service.PushMassegeService;
import com.wang.spring.service.UserMassegeService;
import com.wang.spring.util.Dealstring;
import com.wang.spring.util.Savefile;
import com.wang.spring.util.TokenUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/Push")
public class PushMassegeController {
    private Savefile savefile = new Savefile();
    private Dealstring dealstring = new Dealstring();
    @Resource
    private PushMassegeService pushMassegeService;
    @Resource
    private UserMassegeService userMassegeService;
    @RequestMapping(value = "/pushcontent", method = RequestMethod.POST)
    @ResponseBody
    public String  insertPushcontent(HttpServletRequest request) throws Exception{    //登录
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("img[]");
        String html = request.getParameter("html");
        String token = request.getHeader("Authorization");
        List<String> filename = new ArrayList<>();

        //存储接收发布内容图片
        int i = 0;
        while ( i < files.size()){
            byte [] byteArr=files.get(i).getBytes();
            InputStream inputStream = new ByteArrayInputStream(byteArr);
            savefile.savePic(inputStream,files.get(i).getOriginalFilename());
            filename.add(files.get(i).getOriginalFilename());
            i++;
        }

        //处理htmls中网页链接为本地服务器图片地址
        String htmls= dealstring.dealhtml(html,filename);


        //通过token获取userid
        String [] verify = TokenUtil.verify(token);
        String username = verify[1];
        UserMassege userMassege = userMassegeService.getUsermassegeByusername(username);
        int userid = userMassege.getUserid();


        PushMassege pushmassege = new PushMassege();
        pushmassege.setContent(htmls);
        pushmassege.setUser_id(userid);
        pushmassege.setTitle("test");
        pushmassege.setPushtime(new Timestamp(System.currentTimeMillis()));
        pushMassegeService.insertPushmassege(pushmassege);

        return "false";
    }
}

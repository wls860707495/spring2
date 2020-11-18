package com.wang.spring.service;

import com.wang.spring.pojo.UserMassege;

public interface UserMassegeService {

    UserMassege getUsermassegeByusername(String s);;
    void insertUsermassege(UserMassege usermassege);
	void updatepassword(UserMassege usermassege);
	String checklogin(String username,String password);
}

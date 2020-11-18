package com.wang.spring.dao;


import com.wang.spring.pojo.UserMassege;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value ="UserMessegeDao")
public interface UserMassegeDao {
	 UserMassege getUsermassegeByusername(String s);
	 void insertUsermassege(UserMassege usermassege);
	 void updatepassword(UserMassege usermassege);

}

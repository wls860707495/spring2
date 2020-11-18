package com.wang.spring.service.impl;

import com.wang.spring.dao.UserMassegeDao;
import com.wang.spring.pojo.UserMassege;
import com.wang.spring.service.UserMassegeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


@Service("userMassegeService")
public class UserMassegeServiceimpl implements UserMassegeService {
	@Resource
	private UserMassegeDao userMassegeDao;

	@Override
	public UserMassege getUsermassegeByusername(String s) {
		// TODO Auto-generated method stub

		return userMassegeDao.getUsermassegeByusername(s);
	}


	public String checklogin(String username, String password) {
		// TODO Auto-generated method stub
		UserMassege userMassege = userMassegeDao.getUsermassegeByusername(username);
		if(userMassege != null && userMassege.getPassword().equals(password)){
			return "correct";
		}else{
		
		return "notcorrect";
	    }
	}

	@Override
	public void insertUsermassege(UserMassege usermassege) {
		// TODO Auto-generated method stub
	     userMassegeDao.insertUsermassege(usermassege);
	}



	@Override
	public void updatepassword(UserMassege usermassege) {
		// TODO Auto-generated method stub
		userMassegeDao.updatepassword(usermassege);
	}

}

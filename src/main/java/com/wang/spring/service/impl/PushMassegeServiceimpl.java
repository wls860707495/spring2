package com.wang.spring.service.impl;

import com.wang.spring.dao.PushMassegeDao;

import com.wang.spring.pojo.PushMassege;
import com.wang.spring.service.PushMassegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("pushMassegeService")
public class PushMassegeServiceimpl implements PushMassegeService {
	@Resource
	private PushMassegeDao pushMassegeDao;

	@Override
	public void insertPushmassege(PushMassege pushmassege) {
		// TODO Auto-generated method stub
		pushMassegeDao.insertPushmassege(pushmassege);
	}

}

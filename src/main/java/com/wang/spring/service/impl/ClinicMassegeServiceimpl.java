package com.wang.spring.service.impl;

import com.wang.spring.dao.ClinicMassegeDao;
import com.wang.spring.pojo.ClinicMassege;
import com.wang.spring.service.ClinicMassegeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("clinicMassegeService")
public class ClinicMassegeServiceimpl implements ClinicMassegeService {
	@Resource
	private ClinicMassegeDao clinicMassegeDao;

	@Override
	public void insertClinicmassege(ClinicMassege clinicmassege) {
		// TODO Auto-generated method stub
		clinicMassegeDao.insertClinicmassege(clinicmassege);
	}

}

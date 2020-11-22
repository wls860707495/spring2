package com.wang.spring.dao;


import com.wang.spring.pojo.ClinicMassege;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value ="ClinicrMessegeDao")
public interface ClinicMassegeDao {
	 void insertClinicmassege(ClinicMassege clinicmassege);


}

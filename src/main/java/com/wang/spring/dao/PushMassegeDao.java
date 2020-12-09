package com.wang.spring.dao;


import com.wang.spring.pojo.PushMassege;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value ="PushMessegeDao")
public interface PushMassegeDao {
	 void insertPushmassege(PushMassege pushmassege);
	 List<PushMassege> getPushMassege();


}

package com.wang.spring.service;

import com.wang.spring.pojo.PushMassege;

import java.util.List;

public interface PushMassegeService {

    void insertPushmassege(PushMassege pushmassege);
    List<PushMassege> getPushMassege();
}

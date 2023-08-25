package com.example.demo.biz;

import com.example.demo.dao.Schoolinfo;

import java.util.List;

public interface ISchoolBiz {

    List<Schoolinfo> findAll();
}

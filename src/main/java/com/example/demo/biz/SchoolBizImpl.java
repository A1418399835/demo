package com.example.demo.biz;


import com.example.demo.dao.ISchoolDao;
import com.example.demo.dao.Schoolinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolBizImpl implements ISchoolBiz{

    @Autowired
    private ISchoolDao schoolDao;

    @Override
    public List<Schoolinfo> findAll(){
        return schoolDao.findAll();
    }

}

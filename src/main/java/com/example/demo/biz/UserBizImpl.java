package com.example.demo.biz;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements IUserBiz{

    @Autowired
    private IUserDao userDao;

    @Override
    public int add(Userinfo user) {
        //先检查此用户信息中的手机号码是否被使用
        int rows = userDao.findByMobile(user.getMobile());
        if (rows>0){
            return 10001;
        }

        int count =userDao.add(user);
        return count > 0 ? 0 : 30001;
    }
}

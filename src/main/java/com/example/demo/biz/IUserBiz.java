package com.example.demo.biz;

import com.example.demo.entity.Userinfo;

/**
 * 业务接口：处理user表的数据
 * author：xxx
 * date：2023-05-22
 */
public interface IUserBiz {
    /**
     *用户报名时调用的业务方法
     * @param user 用户各项数据
     * @return boolen 成功为true，失败为false
     */
    public int add(Userinfo user);

}

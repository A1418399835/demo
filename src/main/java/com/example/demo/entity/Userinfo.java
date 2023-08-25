package com.example.demo.entity;

/**
 * 数据实体：对应数据库中tbl_javab_user
 * author:xxx
 * data:2023-05-22
 */
public class Userinfo {
    private int userid;
    private String realname;
    private  boolean sex;       //数据表中是bit型，所以对应java是boolean
    private  String mobile;
    private  int school;
    private  int banji;
    private  String course;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public int getBanji() {
        return banji;
    }

    public void setBanji(int banji) {
        this.banji = banji;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

package com.example.demo.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ISchoolDao {
    @Select("SELECT * FROM tbl_javab_school ORDER BY schoolid")
    List<Schoolinfo> findAll();
}

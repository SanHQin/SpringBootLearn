package com.example.dao;

import com.example.daomain.fanya_tmp_student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface studentDao {
    @Select("select * from fanya_tmp_student where xh = #{xh}")
    public fanya_tmp_student getByxh(String xh);
}

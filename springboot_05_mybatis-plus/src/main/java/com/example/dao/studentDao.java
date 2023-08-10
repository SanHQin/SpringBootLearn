package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.daomain.fanya_tmp_student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface studentDao extends BaseMapper<fanya_tmp_student> {

}

package com.monkey.diary.dao;

import com.monkey.diary.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {

    List<TestVo> selectTestList() throws Exception;
}

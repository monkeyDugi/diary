package com.monkey.diary.service.impl;

import com.monkey.diary.dao.TestDao;
import com.monkey.diary.service.TestService;
import com.monkey.diary.vo.TestVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public List<TestVo> getTestList() throws Exception {

        return testDao.selectTestList();
    }
}

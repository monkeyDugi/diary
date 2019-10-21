package com.monkey.diary.testController;

import com.monkey.diary.service.TestService;
import com.monkey.diary.vo.TestVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/list/diary")
    public List<TestVo> rest1() throws Exception {

        List<TestVo> testList = new ArrayList<>();
        testList = testService.getTestList();

        return testList;
    }
}

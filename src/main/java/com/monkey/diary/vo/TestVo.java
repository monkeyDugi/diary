package com.monkey.diary.vo;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("testVO")
@Getter
@Setter
public class TestVo {

    private String userId;
    private String title;
    private String content;
    private Date regDate;
}

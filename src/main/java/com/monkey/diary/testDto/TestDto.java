package com.monkey.diary.testDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TestDto {

    private String userId;
    private String subject;
    private String content;
    private String date;


}

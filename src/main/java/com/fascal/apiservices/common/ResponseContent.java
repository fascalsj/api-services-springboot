package com.fascal.apiservices.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResponseContent {
    private String result;
    private String message;
    private Long timestamp;
    private Object data;
}

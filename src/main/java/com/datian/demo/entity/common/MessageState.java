package com.datian.demo.common;

import java.util.Map;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: huangyx
 * @Date: 2021/8/3 17:50
 *
 */
@Data
@Accessors(chain = true)
public class MessageState {

    private Map<String,String> data;
    private String type;
}

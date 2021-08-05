package cn.hyx.bg.entity.common;

import java.util.Map;

import lombok.Data;

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

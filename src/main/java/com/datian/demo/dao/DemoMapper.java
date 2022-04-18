package com.datian.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datian.demo.entity.db.Demo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hyx
 * @since 2022-03-26
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

}

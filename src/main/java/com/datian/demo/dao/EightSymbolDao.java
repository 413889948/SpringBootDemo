package com.datian.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datian.demo.entity.db.EightSymbol;

import org.apache.ibatis.annotations.Mapper;


/**
 * (EightSymbol)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-23 16:02:46
 */
@Mapper
public interface EightSymbolDao extends BaseMapper<EightSymbol> {

}

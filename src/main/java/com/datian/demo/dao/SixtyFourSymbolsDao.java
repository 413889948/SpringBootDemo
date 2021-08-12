package com.datian.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datian.demo.entity.db.SixtyFourSymbols;

import org.apache.ibatis.annotations.Mapper;


/**
 * (SixtyFourSymbols)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-23 16:07:32
 */
@Mapper
public interface SixtyFourSymbolsDao extends BaseMapper<SixtyFourSymbols> {

}

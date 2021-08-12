package com.datian.demoservice.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datian.demo.dao.EightSymbolDao;
import com.datian.demo.entity.db.EightSymbol;
import com.datian.demo.service.EightSymbolService;

import org.springframework.stereotype.Service;

/**
 * (EightSymbol)表服务实现类
 *
 * @author makejava
 * @since 2021-07-23 16:02:47
 */
@Service("eightSymbolService")
public class EightSymbolServiceImpl extends ServiceImpl<EightSymbolDao, EightSymbol> implements EightSymbolService {

}

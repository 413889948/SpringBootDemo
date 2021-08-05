package cn.hyx.bg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.hyx.bg.dao.EightSymbolDao;
import cn.hyx.bg.entity.db.EightSymbol;
import cn.hyx.bg.service.EightSymbolService;

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

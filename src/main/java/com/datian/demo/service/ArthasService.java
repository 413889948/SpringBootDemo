package com.datian.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.datian.demo.entity.common.ArthasEntity;
import com.datian.demo.entity.db.EightSymbol;

/**
 * (EightSymbol)表服务接口
 *
 * @author makejava
 * @since 2021-07-23 16:02:47
 */
public interface ArthasService {

    /**
     *  测试显示方法详细入参出参，watch命令
     */
     ArthasEntity showMethodByWatch(ArthasEntity entity) throws Exception;
    Boolean threadWait(String string);

}

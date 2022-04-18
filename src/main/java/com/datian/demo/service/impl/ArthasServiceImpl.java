package com.datian.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datian.demo.dao.DemoMapper;
import com.datian.demo.dao.EightSymbolDao;
import com.datian.demo.entity.common.ArthasEntity;
import com.datian.demo.entity.db.Demo;
import com.datian.demo.entity.db.EightSymbol;
import com.datian.demo.service.ArthasService;

import com.datian.demo.thread.OneThread;
import com.datian.demo.thread.TwoThread;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * (EightSymbol)表服务实现类
 *
 * @author makejava
 * @since 2021-07-23 16:02:47
 */
@Service("ArthasService")
public class ArthasServiceImpl implements ArthasService {
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public ArthasEntity showMethodByWatch(ArthasEntity entity) throws Exception {
        if (Objects.equals(entity.getId(), "throw")) {
            throw new Exception("抛出异常");
        }
        entity.setId(entity.getId() + "附加");
        demoMapper.insert(new Demo().setValue(entity.getId()));
        return new ArthasEntity().setId(entity.getId())
                .setIsNotNone(StringUtils.isNotEmpty(entity.getId()));
    }

    @Override
    public Boolean threadWait(String string) {

        Object o = new Object();
        new Thread(new OneThread(demoMapper)).start();
        for (int i = 0; i < 12; i++) {
            new Thread(new TwoThread(demoMapper)).start();
        }
        return Boolean.TRUE;
    }
}

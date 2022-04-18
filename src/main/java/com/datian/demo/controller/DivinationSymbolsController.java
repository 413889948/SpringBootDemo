package com.datian.demo.controller;

import com.datian.demo.entity.common.ArthasEntity;
import com.datian.demo.service.ArthasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: huangyx
 * @Date: 2021/7/22 10:14
 */
@Controller
@CrossOrigin
@Api(tags = "测试的类")
public class DivinationSymbolsController {

    @Autowired
    private ArthasService arthasService;


    @ResponseBody
    @RequestMapping(value = "/showMethodByWatch", method = RequestMethod.GET)
    public ArthasEntity showMethodByWatch(String string) throws Exception {
        return arthasService.showMethodByWatch(new ArthasEntity().setId(string));
    }
    @ResponseBody
    @RequestMapping(value = "/threadWait", method = RequestMethod.GET)
    public Boolean threadWait(String string) throws Exception {
        return arthasService.threadWait(string);
    }
}

package com.datian.demo.config;

import com.datian.demo.utils.DivinationUtil;
import com.taobao.arthas.agent.attach.ArthasAgent;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;

/**
 * @author hyx
 * @date 2022/3/25 22:35
 */
@Component
public class WebConfig implements WebMvcConfigurer {
    /*
     * 添加静态资源文件，外部可以直接访问地址
     *
     * @param registry
     */

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        HashMap<String, String> configMap = new HashMap<>(16);
        configMap.put("arthas.appName", "demo");
        configMap.put("arthas.ip", "0.0.0.0");
        configMap.put("arthas.httpPort", "8563");
        configMap.put("arthas.username", "hyx");
        configMap.put("arthas.password", "h8986345@");
        configMap.put("arthas.localConnectionNonAuth", "false");
        ArthasAgent.attach(configMap);
        ArthasAgent.attach();
        DivinationUtil.get();

    }
}

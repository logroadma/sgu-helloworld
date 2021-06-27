package com.mtk.boot.config;

import com.mtk.boot.bean.Cat;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置文件是按照写的先后顺序来注入的
 */
@Configuration
public  class MyConfig {
    @ConditionalOnBean(name = "tom")
    @Bean("hua")
    public Cat cat(){
        return new Cat("花花");
    }

    @Bean("tom")
    public Cat tom(){
        return new Cat("花花");
    }


}

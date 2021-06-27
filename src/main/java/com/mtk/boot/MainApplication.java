package com.mtk.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        Logger logger = LoggerFactory.getLogger(MainApplication.class);
        logger.info("");
        boolean tom = run.containsBean("tom");
        System.out.println("容器中存在tom的组件："+tom);
        boolean hua = run.containsBean("hua");
        System.out.println("容器中存在hua的组件："+hua);

        System.out.println("容器中是否存在 goldPriceProducer"+run.containsBean("goldPriceProducer"));

    }
}

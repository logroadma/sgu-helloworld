package com.mtk.boot.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.UUID;

/**
 * 黄金行情生产这
 */
@Component
public class GoldPriceProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    public void produceMsg(){
        jmsMessagingTemplate.convertAndSend(topic,"黄金行情价格"+ UUID.randomUUID().toString().substring(0,6));
    }

    //间隔时间3秒进行定投
    @Scheduled(fixedDelay = 3000)
    public void  produceMsgScheduled(){
        jmsMessagingTemplate.convertAndSend(topic,"黄金行情价格定时投送："+ UUID.randomUUID().toString().substring(0,6));
        System.out.println("正在定时投送黄金价格");

    }

}

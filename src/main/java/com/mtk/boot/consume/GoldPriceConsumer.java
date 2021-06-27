package com.mtk.boot.consume;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 *  在服务后端实现了消费者的消费，实现在前端也要有一份
 */

@Component
public class GoldPriceConsumer {

    @JmsListener(destination = "${myTopic}")
    public void receive(TextMessage text) throws JMSException {
        String priceText = text.getText();
        System.out.println("消费者收到订阅的消息为："+priceText);
    }
}

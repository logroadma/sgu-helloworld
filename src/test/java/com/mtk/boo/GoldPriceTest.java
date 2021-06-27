package com.mtk.boo;

import com.mtk.boot.MainApplication;
import com.mtk.boot.produce.GoldPriceProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import sun.applet.Main;

import javax.annotation.Resource;
import javax.jms.Topic;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
public class GoldPriceTest {
    @Autowired
    GoldPriceProducer goldPriceProducer;

    @Test
    public void  testSendPriceFixedDelay(){
        goldPriceProducer.produceMsg();
    }
}

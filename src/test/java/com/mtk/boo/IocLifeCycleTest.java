package com.mtk.boo;

import com.mtk.boot.MainApplication;
import com.mtk.boot.config.MainConfigLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/*@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)*/

public class IocLifeCycleTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("容器中的名称："+name);
        }
        System.out.println("ioc容器创建完成");
        context.close();
    }
}

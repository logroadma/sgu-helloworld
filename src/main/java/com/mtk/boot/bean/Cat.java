package com.mtk.boot.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Cat implements Serializable, BeanNameAware {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("car中的名称是：" + s);
    }

    public static void main(String[] args) {
     /*   String name = "Jobs";
        System.out.println(name.substring(1));
        //从第二个字符开始截取 —— 预期结果是 obs
        System.out.println(name.replace("o", "x"));
        System.out.println(name.toUpperCase());
        System.out.println(name); // 依然是 Jobs

        ThreadLocal threadLocal=new ThreadLocal();

        ClassLoader classLoader = name.getClass().getClassLoader();*/


    }

    public static int testFinally() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        } finally {
            return 2;
        }
    }


}

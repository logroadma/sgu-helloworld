package com.mtk.boot.pojo;

import sun.misc.ConditionLock;

import java.lang.reflect.Field;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Objects;
import java.lang.String;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Person {
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) throws UnknownHostException, ClassNotFoundException {
 /*       InetAddress addr = InetAddress.getByName("www.baidu.com");
        int port = 4321;
        InetSocketAddress isa = new InetSocketAddress(addr, port);
        System.out.println(isa);
        System.out.println(isa.getAddress());
        System.out.println(isa.getPort());

        Class<?> aClass = Class.forName("com.mtk.boot.pojo.Person");
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.isSynthetic();
        }*/
        BlockingQueue<String> queue= new ArrayBlockingQueue<>(3);
        queue.offer("a");
        queue.offer("b");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println("sss");
        for (String s : queue) {
            System.out.println(s);
        }

        ReentrantLock lock=new ReentrantLock();
        Condition condition = lock.newCondition();

        ConditionLock conditionLock=new ConditionLock();

    }

}

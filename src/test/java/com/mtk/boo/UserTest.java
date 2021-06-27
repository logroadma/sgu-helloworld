package com.mtk.boo;

import com.mtk.boot.MainApplication;
import com.mtk.boot.service.UserService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import sun.applet.Main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@SpringBootTest(classes = MainApplication.class)
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    void testUser() {
        userService.testSameObj();
        System.out.println("0000");

    }

    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1;
            }
        });
        queue.add("a");
        queue.add("b");
        queue.add("c");
        for (String s : queue) {
            System.out.println(s);
        }

        PriorityQueue<Map.Entry<String,Integer>> entryPriorityQueue=new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        System.out.println(map.getOrDefault("1", 0));
        map.put("b",2);
        map.put("c",3);
        entryPriorityQueue.addAll(map.entrySet());
        for (int i = 0; i < 3; i++) {
            Map.Entry<String, Integer> remove = entryPriorityQueue.remove();
            System.out.println(remove.getKey()+"-->"+ remove.getValue());
            System.out.println("队列剩余长度："+entryPriorityQueue.size());
        }
        System.out.println();
        for (Map.Entry<String, Integer> entry : entryPriorityQueue) {
            System.out.println("entyr"+entry);
        }
    }
}

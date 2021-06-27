package com.mtk.boot.pojo;

import org.springframework.core.type.AnnotationMetadata;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PersonTest2 {
//    public static void main(String[] args) {
//        String s="aabbbc";
//        char[] chars = s.toCharArray();
//
//        TreeMap<String,Integer> map=new TreeMap<>();
//        TreeMap<String,Integer> map2=new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return map.get(o2)-map.get(o1);
//            }
//        });
//        for (char aChar : chars) {
//            if (map.get(aChar+"")!=null){
//                Integer integer = map.get(aChar+"");
//                map.put(aChar+"",integer+1);
//            }else{
//                map.put(aChar+"",1);
//            }
//        }
//
//        map2.putAll(map);
//        System.out.println("mp2---处理");
//        map2.entrySet().stream().forEach(item->{
//            System.out.println(item.getKey()+"--->"+item.getValue());
//        });
//
//
//        map.values().stream().forEach(System.out::println);
//        StringBuilder sb=new StringBuilder();
//
//        map.entrySet().stream().sorted((obj1,obj2)->{
//            return obj2.getValue()-obj1.getValue();
//        }).forEach(item->{
//            System.out.println(item.getKey()+"-->"+item.getValue());
//            String key = item.getKey();
//            Integer value = item.getValue();
//            for (Integer i = 0; i < value; i++) {
//                sb.append(key);
//            }
//        });
//
//        System.out.println(sb);
//        System.out.println("使用队列方式");
//
//
//    }
}

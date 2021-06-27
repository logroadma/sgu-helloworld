package com.mtk.boot.pojo;

import javax.swing.tree.TreeNode;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Stack;

public class PersonTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, ClassNotFoundException {
//        Class<Person> clazz = Person.class;
        Class<?> clazz = Class.forName("com.mtk.boot.pojo.Person");
        Person obj = (Person) clazz.newInstance();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field + "-->" + field.getName());

            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);
            name.set(obj, "mhj");

            System.out.println(name.get(obj));
            System.out.println(((Person) obj).getName());

        }

        LinkedHashMap map = new LinkedHashMap(16);
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        System.out.println(map);
        map.get("1");
        System.out.println(map);

        Stack stack = new Stack();

        System.out.println("---------------");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            set.add(i);
        }
        set.stream().limit(10).forEach(System.out::println);

        System.out.println("-----");
        for (Integer integer : set) {
            System.out.println(integer);
        }

    }
}

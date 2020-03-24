package com.example.simple_demo;

import com.example.simple_demo.mapper.JsonMapper;
import com.example.simple_demo.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @RequestMapping("/hello")
    public  String  login(){
        System.out.println("hello world!!");
        return "hello world!!";
    }
    @RequestMapping("closed")
    public String  close(){


        return "This door is closed!";
    }

    public static void main(String[] args) {
      /*  Collection collection = new ArrayList();
        collection.add(4);
        collection.add(2);
        collection.add(8);
        Collection collection2 = new ArrayList();
        collection2.add(2);
        collection2.add("abc");
        collection2.add('a');
        // 在调用者中  留下交集的部分
        boolean flag = collection.retainAll(collection2);
        System.out.println(flag);// 如果因为取交集删除元素了  true  没有删除元素   false
        System.out.println(collection);


        // 2 增强for循环
        for (Object object : collection2) {// 一遍遍历一边删除数据  抛异常
            // ConcurrentModificationException  并发修改异常
            collection2.remove(object);
            System.out.println(object);
        }
        //3  获得迭代器
        Iterator iterator = collection2.iterator();
        // hasNext 判断是否有下一个元素
        // next 获取下一个元素 , 将指针向下移动一位
        while(iterator.hasNext()){
            Object object = iterator.next();
            iterator.remove();// 删除元素
            System.out.println(object);
        }
        System.out.println(collection2);*/
      //1.8 jdk
      /*  List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");

        List<String> list2 = new ArrayList<String>();
        list2.add("2");
        list2.add("7");
        list2.add("10");

        //交集
        List<String> collect1 = list1.stream().filter(num -> list2.contains(num))
                .collect(Collectors.toList());
        System.out.println("交集");
        collect1.stream().forEach(System.out::println);

        //差集 list1-list2
        List<String> collect2 = list1.stream().filter(num -> !list2.contains(num))
                .collect(Collectors.toList());
        System.out.println("差集list1-list2");
        collect2.stream().forEach(System.out::println);

        //差集list2-list1
        List<String> collect3 = list2.stream().filter(num -> !list1.contains(num))
                .collect(Collectors.toList());
        System.out.println("差集list2-list1");
        collect3.stream().forEach(System.out::println);

        //并集  不去重
        list1.addAll(list2);
        System.out.println("并集  不去重");
        list1.stream().forEach(System.out::println);

        //并集  去重
        List<String> collect4 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println("并集  去重");
        collect4.stream().forEach(System.out::println);*/
        List<Student> list1 = new ArrayList<Student>(){{
            add(new Student("Linda",20));
            add(new Student("Bruce",20));
            add(new Student("Linda",21));
        }};
        List<Student> list2 = new ArrayList<Student>(){{
            add(new Student("Linda",21));
            add(new Student("Bruce",22));
            add(new Student("Jack",21));
        }};
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("Linda",22);
        objectObjectHashMap.put("Bruce",16);
        objectObjectHashMap.put("Jack",99);

        objectObjectHashMap.put("Jack",96);
        JsonMapper jsonMapper = new JsonMapper();

        System.out.println("objectObjectHashMap====="+objectObjectHashMap);
        System.out.println("objectObjectHashMap222====="+ jsonMapper.toJson(objectObjectHashMap));
        //求出交集
        list1.retainAll(list2);
        System.out.println(list1);


    }


}

package com.springrain.test;

import com.springrain.entity.TestExtend;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试spring的继承关系
public class Test4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-extends.xml");
        TestExtend testExtend = (TestExtend) applicationContext.getBean("testExtend");
        System.out.println(testExtend);
    }
}

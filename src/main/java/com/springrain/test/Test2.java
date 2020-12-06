package com.springrain.test;

import com.springrain.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//测试p命名空间
public class Test2 {
    public static void main(String[] args) {
        //加载配置⽂件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-p.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}

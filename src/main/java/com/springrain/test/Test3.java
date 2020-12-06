package com.springrain.test;

import com.springrain.entity.Address;
import com.springrain.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//测试p命名空间
public class Test3 {
    public static void main(String[] args) {
        //加载配置⽂件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-depends.xml");
        Student student = (Student) applicationContext.getBean("student");
        Address address = (Address) applicationContext.getBean("address");

    }
}

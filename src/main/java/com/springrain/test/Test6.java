package com.springrain.test;

import com.springrain.entity.Person;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
测试自动装载
 */
public class Test6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);
    }


}

package com.springrain.test;

import com.springrain.entity.Car;
import com.springrain.factory.InstanceCarFactory;
import com.springrain.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        //测试静态工厂
//        Car car = StaticCarFactory.get(1L);
//        System.out.println(car);
//
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
//        Car car = (Car) applicationContext.getBean("car");
//        System.out.println(car);

        /*
        测试简单工厂
         */

//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        Car car = instanceCarFactory.getCar(1L);
//        System.out.println(car);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car = (Car) applicationContext.getBean("car2");
        System.out.println(car);

    }
}

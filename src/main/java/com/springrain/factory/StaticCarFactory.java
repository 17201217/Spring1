package com.springrain.factory;

import com.springrain.entity.Car;

import java.util.HashMap;
import java.util.Map;

/*
静态工厂方法
 */
public class StaticCarFactory {
    private static Map<Long, Car> carMap;
    static{
        carMap = new HashMap<Long, Car>();
        carMap.put(1L,new Car(1L,"宝马"));
        carMap.put(2L,new Car(2L,"奔驰"));
    }
    public static Car getCar(Long id){
        return carMap.get(id);
    }
}

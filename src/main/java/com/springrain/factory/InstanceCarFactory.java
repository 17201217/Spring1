package com.springrain.factory;

import com.springrain.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private  Map<Long, Car> carMap;
    public InstanceCarFactory(){
        carMap = new HashMap<Long, Car>();
        carMap.put(1L,new Car(1L,"宝马1"));
        carMap.put(2L,new Car(2L,"奔驰1"));
    }
    public  Car getCar(Long id){

        return carMap.get(id);
    }
}

package com.springrain.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private long id;
    private String name;

//    public  Address(){
//        System.out.println("创建了address");
//    }

}

package com.cafe.study.domain;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Apple {
	private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println("Apple Price:" + apple.getPrice());
        
        String pak="com.cafe.study.domain.";
		
        Class clz = Class.forName(pak+"Apple");
        Method setPriceMethod = clz.getMethod("setPrice", int.class);
        Constructor appleConstructor = clz.getConstructor();
        Object appleObj = appleConstructor.newInstance();
        setPriceMethod.invoke(appleObj, 14);
        Method getPriceMethod = clz.getMethod("getPrice");
        System.out.println("Apple Price:" + getPriceMethod.invoke(appleObj));
		
	}

}

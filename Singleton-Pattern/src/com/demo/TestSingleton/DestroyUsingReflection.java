package com.demo.TestSingleton;

import java.lang.reflect.Constructor;

import com.demo.singleton.BillPughSingleton;

public class DestroyUsingReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillPughSingleton instance1=BillPughSingleton.getInstance();
		BillPughSingleton instance2=null;
		try{
			Constructor[] constructors=BillPughSingleton.class.getDeclaredConstructors();
			for(Constructor constructor:constructors){
				constructor.setAccessible(true);
                instance2 = (BillPughSingleton) constructor.newInstance();
                break;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	   System.out.println(instance1.hashCode());
	   System.out.println(instance2.hashCode());
	}
}

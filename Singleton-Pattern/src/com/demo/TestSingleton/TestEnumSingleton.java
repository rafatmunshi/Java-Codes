package com.demo.TestSingleton;

import com.demo.singleton.EnumSingleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSingleton instance1=EnumSingleton.INSTANCE;
		EnumSingleton instance2=EnumSingleton.INSTANCE;
		
		System.out.println(instance1.hashCode());
	    System.out.println(instance2.hashCode());
	    
	    System.out.println(instance1.getValue());
	    instance1.setValue(2);
	    System.out.println(instance1.getValue());
	}

}

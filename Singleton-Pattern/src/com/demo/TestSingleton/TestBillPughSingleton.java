package com.demo.TestSingleton;

import com.demo.singleton.BillPughSingleton;

public class TestBillPughSingleton {
	
	public static void main(String args[]){
		BillPughSingleton instanceOne = BillPughSingleton.getInstance();	    
	    System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	    BillPughSingleton instanceOne1 = BillPughSingleton.getInstance();
	    System.out.println("instanceTwo hashCode="+instanceOne1.hashCode());
	}	
}
package demo;

import java.io.FileNotFoundException;
import java.io.IOException;

//A Simple Java program to demonstrate 
//method overriding in java 

//Base Class 
class Parent { 
	protected  void show() 
	{ 
		System.out.println("Parent's show()"); 
	} 
} 

//Inherited class 
class Child extends Parent { 
	// This method overrides show() of Parent 
	@Override	
   public void show() 
	{ 
		System.out.println("Child's show()"); 
	} 
} 

//Driver class 
class  Overriding{ 
	public static void main(String[] args) 
	{ 
		// If a Parent type reference refers 
		// to a Parent object, then Parent's 
		// show is called 
		Parent obj1 = new Parent(); 
		obj1.show(); 

		Parent obj2 = new Child(); 
		obj2.show(); 
	} 
} 

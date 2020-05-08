package demo;

interface Left{
	
	default void m1(){
		System.out.println("calling left method.");
	}	
	
	public static void main(String args[]){
		System.out.println("calling left method.");
	}
}

interface Right{

	default void m1(){
		System.out.println("calling right method.");
	}	
}

public class DiamondProblem implements Left,Right {
	
	public void m1(){
		Left.super.m1();
	}

	public static void main(String args[]){
		DiamondProblem d=new DiamondProblem();
		d.m1();	
	}
}
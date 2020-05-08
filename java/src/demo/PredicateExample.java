package demo;

import java.util.function.*;
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p1=i->i%2==0;
		
		System.out.println(p1.test(20));		
		
		int arr[]={0,5,10,40,20,30,25};
		
		Predicate<Integer> p2=i->i%2==0;
		
		Predicate<Integer> p3=i->i>10;
		//Combining a predicate
		for(int i:arr){
			if(p2.and(p3).test(i)){
				System.out.println(i);
			}
		}
		for(int i:arr){
			if(p2.or(p3).test(i)){
				System.out.println(i);
			}
		}
		
		for(int i:arr){
			if(p2.negate().test(i)){
				System.out.println(i);
			}
		}
	}
}

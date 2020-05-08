package demo;

import java.util.function.Function;

public class FunctionalExample {

	public static void main(String args[]){
		
			
		Function<Integer,Integer> f=i->i*i;
		
		System.out.println(f.apply(4));
		
		
		Function<String,Integer> f1=i->i.length();
		
		System.out.println(f1.apply("javaisawesome"));
		
		
		Function<String,String> f3=i->i.toUpperCase();
		
		System.out.println(f3.apply("javaisawesome"));
		
		Function<Employee, String> f4 = s ->{
			double sal=s.getSalary();
			String name="";
			if(sal>=10000) name=s.getName();
			else if(sal<5000) name=s.getName();
			return name;
		};	
		Employee[] e={new Employee("abc",4000.00),new Employee("def",10000.00),new Employee("xyz",15000.00),new Employee("mno",8000.00)};
		
		for(Employee e1:e){
			System.out.println(!f4.apply(e1).equalsIgnoreCase("")?e1.getName():"No name");
		}
		
		Function<Integer,Integer> f5=i->2*i;
		Function<Integer,Integer> f6=i->i*i*i;
		System.out.println(f5.andThen(f6).apply(2)); //You can take multiple and Then
		System.out.println(f5.compose(f6).apply(2)); // You can take multiple compose 
		
	}	
}

package demo;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerExample {
	
	public static void main(String args[]) {
		
		Employee[] e={new Employee("abc",4000.00),new Employee("def",10000.00),new Employee("xyz",15000.00),new Employee("mno",8000.00)};
		
		Function<Employee, String> f4 = s ->{
			double sal=s.getSalary();
			String name="";
			if(sal>=10000) name=s.getName();
			else if(sal<5000) name=s.getName();
			return name;
		};		
		
		Consumer<Employee> c1=s->{
			System.out.println(f4.apply(s));			
		};
		
		for(Employee e1:e){
			c1.accept(e1);
		}
	}
}
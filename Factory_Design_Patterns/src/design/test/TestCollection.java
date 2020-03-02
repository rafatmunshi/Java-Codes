package design.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {
	
	public static void main(String arge[]){
		
		ArrayList<Employee> e =new ArrayList<Employee>();
		e.add(new Employee(1));
		e.add(new Employee(1));
		System.out.println(e.size());
		
		HashSet<Employee> e1=new HashSet<Employee>();
		e1.add(new Employee(1));
		e1.add(new Employee(1));
		System.out.println(e1.size());
		
		Set e2 = new TreeSet();
		e2.add(new Employee(1));
		e2.add("Hello");
		e2.add(1);
		e1.add(new Employee(1));
		System.out.println(e2.size());
		
		final Employee emp=new Employee(1);
		emp.setEmpId(2);
		System.out.println(emp.getEmpId());		
	}
}

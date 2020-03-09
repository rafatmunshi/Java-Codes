package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapSorting {

	public static void main(String args[]){
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		Employee e6 = new Employee();
		HashMap<Integer, Employee> codenames = new HashMap<Integer, Employee>();
		e.setSalary(1000.00);e1.setSalary(95000.00);e2.setSalary(3000.00);e3.setSalary(4000.00);
		e4.setSalary(3000.00);e5.setSalary(7000.00);e6.setSalary(6000.00);
        codenames.put(101,e);
        codenames.put(1,e1);
        codenames.put(102,e2);
        codenames.put(2,e3);
        codenames.put(105,e4);
        codenames.put(110,e5);
        codenames.put(10,e6);
        System.out.println("HashMap before sorting, random order ");
        Set<Entry<Integer, Employee>> entries = codenames.entrySet();
       
        for(Entry<Integer, Employee> entry : entries){
            System.out.println(entry.getKey() + " ==> " + entry.getValue().getSalary());
        }
        
        Comparator<Entry<Integer, Employee>> valueComparator = new Comparator<Entry<Integer, Employee>>() {	            
	            @Override
	            public int compare(Entry<Integer, Employee> e1, Entry<Integer, Employee> e2) {
	            	int v1 = 0,v2=0;
	            	if(e1.getValue().getSalary()==e2.getValue().getSalary()){
	            		if (e1.getKey() == e2.getKey())
		                    return 0;
		                else if (e1.getKey() > e2.getKey())
		                    return 1;
		                else
		                    return -1;
	            	}else{
	            		if (e1.getKey() == e2.getKey())
		                    return 0;
		                else if (e1.getKey() > e2.getKey())
		                    return -1;
		                else
		                    return 1;
	            	}	            	
	            }
	        };
	        
	        List<Entry<Integer, Employee>> listOfEntries = new ArrayList<Entry<Integer, Employee>>(entries);
	        Collections.sort(listOfEntries,valueComparator);
	        LinkedHashMap<Integer, Employee> sortedByValue = new LinkedHashMap<Integer, Employee>(listOfEntries.size());
	        for(Entry<Integer, Employee> entry : listOfEntries){
	            sortedByValue.put(entry.getKey(), entry.getValue());
	        }
	        
	        System.out.println("HashMap after sorting entries by values ");
	        Set<Entry<Integer, Employee>> entrySetSortedByValue = sortedByValue.entrySet();
	        
	        for(Entry<Integer, Employee> mapping : entrySetSortedByValue){
	            System.out.println(mapping.getKey() + " ==> " + mapping.getValue().getSalary());
	        }
	}
	
}

package design.test;
import java.util.Iterator;
import java.util.NavigableMap; 
import java.util.TreeMap; 
import java.util.concurrent.CopyOnWriteArrayList;
public class Arraylist<T> {
	
	public static void main(String[] args) 
    { 
		
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		
		 l.add("D"); 
		  l.add("A"); 
	        l.add("B"); 
	        l.add("c"); 
	        Iterator itr = l.iterator(); 
	        System.out.println("hi");
	        
	        //Iterator itr = l.iterator(); 
	        while (itr.hasNext()) { 
	            String s = (String)itr.next();
	            System.out.println(s);
	        } 
        NavigableMap<String, Integer> nm = 
                          new TreeMap<String, Integer>(); 
        nm.put("C", 888); 
        nm.put("Y", 999); 
        nm.put("A", 444); 
        nm.put("T", 555); 
        nm.put("B", 666); 
        nm.put("A", 555); 
  
        System.out.printf("Descending Set  : %s%n", 
                                nm.descendingKeySet()); 
        System.out.printf("Floor Entry  : %s%n", 
                                nm.floorEntry("L"));
        System.out.printf("ceiling Entry  : %s%n", 
                nm.ceilingKey("L")); 
        System.out.printf("First Entry  : %s%n", 
                                nm.firstEntry()); 
        System.out.printf("Last Key : %s%n", 
                                nm.lastKey()); 
        System.out.printf("First Key : %s%n", 
                                nm.firstKey()); 
        System.out.printf("Original Map : %s%n", nm); 
        System.out.printf("Reverse Map : %s%n", 
                                 nm.descendingMap()); 
    } 

}

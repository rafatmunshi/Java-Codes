package demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MapTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Normal hash map");
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"abc");
		hm.put(2,"abc");
		hm.put(3,"abc");
		hm.put(4,"abc");
		hm.put(5,"abc");
		hm.put(6,"abc");
		Collections.synchronizedMap(hm);
		Iterator<Integer> it= hm.keySet().iterator();
		while(it.hasNext()){
			Integer e=it.next();
			if(e==6){
				it.remove();
				hm.put(7,"abc");
			}			
			System.out.print(e+" ");
		}
		System.out.println("");
		for(Entry<Integer, String> e:hm.entrySet()){
			System.out.print(e.getKey()+" ");
		}
		System.out.println("");
		System.out.println("Concurrent hash map");
		
		
		Map<Integer,String> chm = new ConcurrentHashMap<Integer,String>();
		chm.put(1,"abc");
		chm.put(2,"abc");
		chm.put(3,"abc");
		chm.put(4,"abc");
		chm.put(5,"abc");
		chm.put(6,"abc");
		Iterator<Integer> it1= chm.keySet().iterator();
		while(it1.hasNext()){
			Integer e=it1.next();
			if(e==6){
				it1.remove();
			}			
			System.out.print(e+" ");
		}
		for(Entry<Integer, String> e:chm.entrySet()){
			//chm.remove(1);
			chm.put(7,"abc");
		}
		System.out.println("");
		for(Entry<Integer, String> e:chm.entrySet()){
			System.out.print(e.getKey()+" ");
		}
		System.out.println("");
		System.out.println("Hash table");
		
		Map<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1,"abc");
		ht.put(2,"abc");
		ht.put(3,"abc");
		ht.put(4,"abc");
		ht.put(5,"abc");
		ht.put(6,"abc");
		Iterator<Integer> it2= ht.keySet().iterator();
		while(it2.hasNext()){
			Integer e=it2.next();
			if(e==6){
				it2.remove();				
			}			
			System.out.print(e+" ");
		}
		
		System.out.println("");
		for(Entry<Integer, String> e:ht.entrySet()){
			//ht.put(7,"abc");
			//ht.remove();
			System.out.print(e.getKey()+" ");
		}
		System.out.println("");
		for(Entry<Integer, String> e:ht.entrySet()){
			//ht.put(7,"abc");
			System.out.print(e.getKey()+" ");
		}		
	}
}
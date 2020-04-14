package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.Comparator.comparing;
public class Iterator8Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList();
		list.add(2);
		list.add(7);		
		list.add(6);		
		list.add(5);		
		list.add(4);
		
		list.forEach(System.out::println);
		
	}

}

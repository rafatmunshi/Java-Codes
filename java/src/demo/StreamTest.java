package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = Arrays.asList(45,4,3,2,1);
		
		List<Integer> square=number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		List<String> names = Arrays.asList("Reflection","Collections","Stream");
		
		List<String> result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> sort=number.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sort);
		
		number.stream().map(x->x).forEach(y->System.out.print(y+" "));		
		System.out.println();
		
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
		System.out.println(even);
		number.forEach(System.out::println);

	}
}

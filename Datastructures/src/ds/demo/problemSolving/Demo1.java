package ds.demo.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Demo1 {
	
	public static int solution(int N){
		int modVal=0;
	LinkedList<Integer> list=new LinkedList<>();
	int new1=N;
	String val="";
	while(N!=0){
		modVal= N % 1000;
		list.add(modVal);
		N/= 1000;
	}
	int temp=0;
	val=String.valueOf(modVal);
	if(new1<0){
		val=val.substring(0,0)+5+val.substring(1,val.length());
	}else{
		temp=Integer.parseInt(String.valueOf(val.charAt(0)));
	}
	if(temp<5 && temp>=0){
	  list.add(0,5);
	  val=5+val;
	  	  
	}else if(temp>5){
	   val=String.valueOf(modVal);
	   for(int i=val.length()-1;i>=0;i--){
		   temp=Integer.parseInt(String.valueOf(val.charAt(i)));
	       if(temp<5){
	    	   val=val.substring(0, val.length()-1)+5+val.substring(val.length()-1,val.length());
	       }
	   }
	}
	String finalValue="";
	for(int i:list){
		finalValue=finalValue.concat(String.valueOf(i));
	}
	return Integer.parseInt(val);}

	public static void main(String args[]){
		int N=-999;
		System.out.println(solution(N));
	}
	
}

package ds.demo.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution7 {
	
	 public static int solution(int[] A) {
		 long productVal=1;
		 int value=0;
		 try{
				if(A==null){
					throw new NullPointerException("Array is blank");
				}else if(A.length==0){
					value= 0;
				}else if(A.length>=1){
					final List<Integer> intList = new ArrayList<Integer>();		
					for (int i=0; i<A.length; i++)
					{
					    intList.add(A[i]);
					}
					if(intList.contains(0)){
						value= 0;
					}
					Object lock=new Object();					
					synchronized(lock){			
						for(int i=0; i<A.length; i++){
							productVal*=intList.get(i);
						}
						//System.out.println(productVal);
						if(productVal<0){
							value=-1;
						}else if(productVal>0){
							value= 1;
						}
					}		
					
				}			
			}catch (NullPointerException e) {
				throw new NullPointerException("Array is blank");
			}catch(Exception e){
				e.printStackTrace();
			}
		return value;		
	 }
	public static void main(String args[]){
		int A[]={1,2,4,5,6,1,2,-4,5,6,1,2,4,5,6,1,2,0};
		System.out.println(solution(A));		
	}
}

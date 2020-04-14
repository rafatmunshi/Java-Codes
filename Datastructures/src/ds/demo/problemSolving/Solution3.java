package ds.demo.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution3 {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long sum=0L;
    	TreeSet<Long> treeSet = new TreeSet<Long>();
    	int value=0;
    	loopA : for(int i=0;i<arr.length;i++){    		
    	 loopB : for(int j=0;j<arr.length;j++){
    			if(arr[i]!=arr[j]){
    				sum=sum+arr[j];
    				System.out.print(arr[j]+" ");
    				value=0;
    			}else{
    				value=value+1;
    				if(value==arr.length){
    					sum=arr[j]*(arr.length-1);
    					break loopB;
    				}
    			}   			
    		}  
    		treeSet.add(sum);
    		if(value==arr.length){
    			break loopA;
    		}
			sum=0;
    		System.out.println("");
    	}
    	System.out.println(treeSet.first()+" "+treeSet.last());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}


package ds.demo.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayGlassHours {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int result=0,negativeStore=0;
    	for(int i=0;i<arr.length;i++){
    		int temp=0;
    		if(i<arr.length && i+2<arr.length){
    			for(int j=0;j<arr[i].length;j++){
    				temp=0;
        			int initLen=j;
        			int maxLen=j+2;
        			if(maxLen<arr.length){  
        				temp=0;
        		    	for(int row=i;row<=i+2;row++){
        		    		for(int col=initLen;col<=maxLen;col++){
        		    			System.out.print(arr[row][col]+" ");
        		    			if(row!=i+1 && (col!=maxLen || col!=initLen)){
        		        			temp = temp + arr[row][col];
        		    			}else if(row==i+1 && (col==maxLen-1)){
        		        			temp = temp + arr[row][col];
        		    			}
        		    		}
        		    		System.out.println("");        		    		
        		    	}
        		    	System.out.println(temp);
        		    	if(temp>result || negativeStore==0){
        					result=temp;
        				}
        		    	negativeStore++;
        			}
        			System.out.println("");
        		}
    		}    		
    	}    	
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	 int arr[][] = new int[][]{ 
    			 {-1, -1,  0, -9, -2, -2},
    			 {-2, -1, -6, -8, -2, -5},
    			 {-1, -1, -1, -2, -3, -4},
    			 {-1, -9, -2, -4, -4, -5},
    			 {-7, -3, -3, -2, -9, -9},
    			 {-1, -3, -1, -2, -4, -5}};

        int result = hourglassSum(arr);

      System.out.println(result);
    }
}
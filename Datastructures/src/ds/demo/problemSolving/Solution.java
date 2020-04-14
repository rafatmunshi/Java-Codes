package ds.demo.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    	int j=0,sum1=0,sum2=0;    	
		while(j<2){
    		int z=0;    		
    		for(int i=0;i<arr.get(z).size();i++){
    			if(j==0){
    				System.out.print(arr.get(z+i).get(i)+" ");
    				sum1=sum1+arr.get(z+i).get(i);
    			}else{    				
    				//i=(arr.size()-1)-i;
    				System.out.print(arr.get(z+i).get(arr.size()-1-i)+" ");
    				sum2=sum2+arr.get(z+i).get(arr.size()-1-i);
    			}    			  			
    		}
    		System.out.println("");
    		j++;
    	}    	
    	if(sum1>sum2){
    		return sum1-sum2;
    	}else{
    		return sum2-sum1;
    	}    	
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

         System.out.println(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}

//INPUT
/*
 * 
3
11 2 4
4 5 6
10 8 -12
*/
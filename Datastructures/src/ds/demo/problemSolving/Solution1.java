package ds.demo.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int positive=0,negative=0,zeros=0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]<0){
    			negative=negative+1;
    		}else if(arr[i]>0){
    			positive=positive+1;
    		}else{
    			zeros=zeros+1;
    		}
    	}
    	DecimalFormat df = new DecimalFormat("0.000000");
    	double p=0.00000D;
    	p=(double)positive/(double)arr.length;
    	System.out.println(df.format(p));
    	p=(double)negative/(double)arr.length;
    	System.out.println(p);
    	p=(double)zeros/(double)arr.length;
    	System.out.println(p);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
/*
Input
6
-4 3 -9 0 4 1 */        
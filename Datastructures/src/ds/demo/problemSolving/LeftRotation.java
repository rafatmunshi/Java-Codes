package ds.demo.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

	static void rotation(int[] array,int rotate){
		int i=0;
		int temp=0;
		while(i<rotate){
			for(int x=0;x<array.length-1;x++){			
				temp=array[x];
				array[x]=array[x+1];			
				array[x+1]=temp;				
			}
			i++;
		}	
		for (int j = 0; j < array.length; j++) {
            System.out.print(String.valueOf(array[j])+" ");
        }
    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // String[] nd = scanner.nextLine().split(" ");

        int n = 5;

        int d = 3;

        int[] a = new int[n];
String aa="1 2 3 4 5";
        String[] aItems = aa.split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        rotation(a,d);
        scanner.close();
    }
}

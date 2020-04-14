package ds.demo.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution6 {

    private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter array size");
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> internal1=null;;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> internal2=new ArrayList<>();
        List<List<Integer>> list1=new ArrayList<>();
        for(int i =0;i<n;i++){
        	//System.out.println("Enter internal"+(i+1)+" array size");
			int arryVal=scanner.nextInt();
			internal1=new ArrayList<>();
			for(int j=0;j<arryVal;j++){
				//System.out.println("Enter internal"+(i+1)+" array"+ (j+1)+" value");
				int inVal=scanner.nextInt();
				internal1.add(inVal);
			}
			list.add(internal1);
		}
       // System.out.println("Enter other array size");
        n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i =0;i<n;i++){
        	//System.out.println("Enter internal"+(i+1)+" array size");
        	internal2=new ArrayList<>();
			for(int j=0;j<2;j++){
				//System.out.println("Enter internal"+(i+1)+" array"+(j+1)+" value");
				int inVal=scanner.nextInt();
				internal2.add(inVal);
			}
			list1.add(internal2);
		}
        
        for(int i =0;i<list1.size();i++){
        	System.out.println(list.get(list1.get(i).get(i)-1).get(list1.get(i).get(1)-1));
        }
	}
}

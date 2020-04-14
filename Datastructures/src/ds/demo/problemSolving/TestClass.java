package ds.demo.problemSolving;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] arr_A = br.readLine().split(" ");
        for(int i_A = 0; i_A < N; i_A++) {
        	A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        int out_ = Solve(N, A);
        System.out.println(out_);

         wr.close();
         br.close();
    }
    static int Solve(int N, int[] A){int curr = 0;
    int near = A[0]; 
    Arrays.sort(A);      //  add this
    System.out.println(Arrays.toString(A));        
    // find the element nearest to zero
    for ( int i=0; i < A.length; i++ ){
        System.out.println("dist from " + A[i] + " = " + Math.abs(0 -A[i]));
        curr = A[i] * A[i]; 
        if ( curr <= (near * near) )  { 
            near = A[i];
        } 
    }
    return near;
    }
}
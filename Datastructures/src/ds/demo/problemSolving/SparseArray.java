package ds.demo.problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArray {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    	int arrayCount[]=new int[queries.length];
    	for(int x=0;x<arrayCount.length;x++){
    		arrayCount[x]=0;
    	}
    	for(int i=0;i<queries.length;i++){
    		for(int j=0;j<strings.length;j++){
    			if(strings[j].equals(queries[i])){
    				arrayCount[i]=1+arrayCount[i];
    			}
    		}
    	}    	
    	return arrayCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.in));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            System.out.println(String.valueOf(res[i]));

           /* if (i != res.length - 1) {
                System.out.println("\n");
            }*/
        }

        //bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}


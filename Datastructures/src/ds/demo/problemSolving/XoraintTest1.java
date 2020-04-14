package ds.demo.problemSolving;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */



public class XoraintTest1 {
	
    public static Map<String,Integer> processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
        Map<String,Integer> retVal = new HashMap<String,Integer>();   
        try{
        	 Comparator<String> idComparator = new Comparator<String>() {	            
                 @Override
                 public int compare(String e1, String e2) {
                 	int v1 = 0,v2=0;
                 	String tmp1[]=e1.split(",");
                 	String tmp2[]=e2.split(",");
             		if (Integer.parseInt(tmp1[0]) == Integer.parseInt(tmp2[0]))
                         return 0;
                     else if (Integer.parseInt(tmp1[0]) > Integer.parseInt(tmp2[0]))
                         return -1;
                     else
                         return 1;    		           		            	
                 }
             };
             
             Collections.sort(array,idComparator);
             for(int i=0;i<array.size();i++){
             	String temp=array.get(i);
         		String tempArr[]=temp.split(",");
         		int salary=Integer.parseInt(tempArr[3].trim());
         		if(!retVal.containsKey(tempArr[2].trim())){
         			retVal.put(tempArr[2].trim(), salary);
         		}
             }
        }catch(Exception e){
        	e.printStackTrace();
        }    
       
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}

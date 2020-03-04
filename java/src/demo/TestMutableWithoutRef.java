package demo;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestMutableWithoutRef {

	public static void main(String[] args)
    {
        //Create a HashMap with mutable key
        HashMap<Account1, String> map = new HashMap<Account1, String>();
          
        //Create key 1
        Account1 a1 = new Account1(1);
        a1.setHolderName("A_ONE");
        //Create key 2
        Account1 a2 = new Account1(2);
        a2.setHolderName("A_TWO");
          
        //Put mutable key and value in map
        map.put(a1, a1.getHolderName());
        map.put(a2, a2.getHolderName());
          
        //Change the keys state so hash map should be calculated again
        a1.setHolderName("Defaulter");
        a2.setHolderName("Bankrupt");
          
        //Success !! We are able to get back the values
        System.out.println(map.get(a1)); //Prints A_ONE
        System.out.println(map.get(a2)); //Prints A_TWO
          
        //Try with newly created key with same account number
        Account1 a3 = new Account1(1);
        a3.setHolderName("A_THREE");
        //map.put(a3, a3.getHolderName()); 
        System.out.println(map.get(a3)); //Prints A_ONE
        
        for(Entry<Account1, String> e:map.entrySet()){
			System.out.println(e.getKey().getAccountNumber()+"-"+e.getValue()+" ");
		}  
    }
}

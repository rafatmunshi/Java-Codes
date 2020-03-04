package demo;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestMutableKeyWithReference
{
    public static void main(String[] args)
    {
        //Create a HashMap with mutable key
        HashMap<Account, String> map = new HashMap<Account, String>();
          
        //Create key 1
        Account a1 = Account.AccountBuilder.anAccount().withAccNumber(1).withName("Suraj").build();          
        //Put mutable key and value in map
        map.put(a1,"Mumbai");
        for(Entry<Account, String> e:map.entrySet()){
			System.out.println(e.getKey().getAccountNumber()+"-"+e.getValue()+" ");
		}
        
        Account a2 = Account.AccountBuilder.anAccount(a1).withName("Trupti").build();
        map.put(a2,"Delhi");
        for(Entry<Account, String> e:map.entrySet()){
			System.out.println(e.getKey().getAccountNumber()+"-"+e.getValue()+" ");
		}        
    	System.out.println(map.get(a2));
        
        Account a3 = Account.AccountBuilder.anAccount().withAccNumber(1).withName("Suraj").build();
        
        System.out.println(a3.hashCode());
        
		System.out.println(map.get(a3));
    }
}
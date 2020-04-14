package ds.demo.problemSolving;
class MTClass extends Thread 
{ 
    public void run() 
    { 
        try
        {
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
        } 
        catch (Exception e) 
        {
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  

public class test 
{ 
    public static void main(String[] args) 
    { 
        for (int i=0; i<=3; i++) 
        {
            MTClass object = new MTClass(); 
            object.start(); 
        } 
    } 
}

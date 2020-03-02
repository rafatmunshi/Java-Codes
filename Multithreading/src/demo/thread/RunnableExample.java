package demo.thread;

class Hi1 implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}	
}

class Hello1 implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}	
}

public class RunnableExample {
	public static void main(String[] args) throws Exception{
		Runnable obj1=new Hi1();
		Runnable obj2=new Hello1();
		Thread t1=new Thread(obj1,"Hi thread");
		Thread t2=new Thread(obj2,"Hello thread");		
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
		System.out.println(t1.getName()+" "+t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.getName()+" "+t1.isAlive());
		System.out.println("Bye");
	}
}
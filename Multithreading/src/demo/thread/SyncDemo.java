package demo.thread;

class Counter implements Runnable{
	int count;
	public synchronized void run(){
		for(int i=0;i<1000;i++){
			count++;
		}
	}
}
public class SyncDemo {
	public static void main(String[] args) throws Exception {		
		Counter c=new Counter();
		Thread t1=new Thread(c);	
		Thread t2=new Thread(c);
		t1.start();		
		t2.start();
		t1.join();
		System.out.println("Count "+c.count);		
	}
}

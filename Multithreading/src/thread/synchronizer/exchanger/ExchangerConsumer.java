package thread.synchronizer.exchanger;

import java.util.ArrayList;
import java.util.concurrent.Exchanger;

class ExchangerConsumer extends Thread {
	  private Exchanger<ArrayList<Integer>> exchanger;
	  private ArrayList<Integer> buffer = new ArrayList<Integer>();
	  public ExchangerConsumer(Exchanger<ArrayList<Integer>> exchanger) {
	    this.exchanger = exchanger;
	  }
	  int i=1;
	  public void run() {
	    while (true) {
	      try {
	        System.out.println("Consumer"+i);
	        buffer = exchanger.exchange(buffer);
	        System.out.println("Consumer"+i+"  has received:" + buffer);
	        Thread.sleep(1000);
	        System.out.println("Consumer"+i+" eating:"+buffer);
	        buffer.clear();
	        i++;
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	  }  
	}
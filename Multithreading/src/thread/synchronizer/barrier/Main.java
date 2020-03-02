package thread.synchronizer.barrier;

import java.util.concurrent.CyclicBarrier;

public class Main {
	  public static void main(String[] args) {
	   //Runnable barrierAction = new Worker();
	    CyclicBarrier barrier = new CyclicBarrier(3);
	    for (int i = 1; i <= 3; i++) {
	      Worker t = new Worker(i, barrier);
	      Thread t1 = new Thread(t);
	      t1.start();
	    }
	  }
	}

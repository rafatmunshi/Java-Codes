package thread.synchronizer.latches;

import java.util.concurrent.CountDownLatch;

class LatchMainService extends Thread {
	  private CountDownLatch latch;

	  public LatchMainService(CountDownLatch latch) {
	    this.latch = latch;
	  }
	  public void run() {
	    try {
	      System.out.println("waiting for services to start.");
	      latch.await();
	      System.out.println("started.");
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}
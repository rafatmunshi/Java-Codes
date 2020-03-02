package thread.synchronizer.latches;

import java.util.concurrent.CountDownLatch;

public class Main {
	  public static void main(String[] args) {
	    // Create a countdown latch with 2 as its counter
	    CountDownLatch latch = new CountDownLatch(2);
	    LatchMainService ms = new LatchMainService(latch);
	    ms.start();
	    for (int i = 1; i <= 2; i++) {
	      LatchHelperService lhs = new LatchHelperService(i, latch);
	      lhs.start();
	    }
	  }
	}
package thread.synchronizer.semaphore;

import java.util.Random;

class RestaurantCustomer extends Thread {
	  private Restaurant r;
	  private int customerID;
	  private static final Random random = new Random();

	  public RestaurantCustomer(Restaurant r, int customerID) {
	    this.r = r;
	    this.customerID = customerID;
	  }
	  public void run() {
	    r.getTable(this.customerID); // Get a table
	    try {
	      int eatingTime = random.nextInt(30) + 1;
	      System.out.println("Customer #" + this.customerID
	          + "  will eat for " + eatingTime + "  seconds.");
	      Thread.sleep(eatingTime * 1000);
	      System.out.println("Customer #" + this.customerID
	          + "  is done  eating.");
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    } finally {
	      r.returnTable(this.customerID);
	    }
	  }
	}

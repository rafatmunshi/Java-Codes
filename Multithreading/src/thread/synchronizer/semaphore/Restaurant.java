package thread.synchronizer.semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;
//from  www. j  a  va  2 s .co m
class Restaurant {
  private Semaphore tables;

  public Restaurant(int tablesCount) {
    this.tables = new Semaphore(tablesCount);
  }

  public void getTable(int customerID) {
    try {
      System.out.println("Customer  #" + customerID
          + "  is trying  to  get  a  table.");
      tables.acquire();
      System.out.println("Customer #" + customerID + "  got  a  table.");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void returnTable(int customerID) {
    System.out.println("Customer #" + customerID + "  returned a  table.");
    tables.release();
  }
}
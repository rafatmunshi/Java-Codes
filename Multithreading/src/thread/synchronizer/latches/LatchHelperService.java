package thread.synchronizer.latches;

import java.util.concurrent.CountDownLatch;
class LatchHelperService extends Thread {
  private int ID;
  private CountDownLatch latch;
  public LatchHelperService(int ID, CountDownLatch latch) {
    this.ID = ID;/*w ww . ja v a2s .c  om*/
    this.latch = latch;
  }
  public void run() {
    try {
      Thread.sleep(5000);
      System.out.println("Service #" + ID + "  has  started...");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      this.latch.countDown();
    }
  }
}

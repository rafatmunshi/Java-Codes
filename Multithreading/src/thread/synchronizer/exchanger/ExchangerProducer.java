package thread.synchronizer.exchanger;

import java.util.ArrayList;
import java.util.concurrent.Exchanger;
/*w  w  w . j a  v  a 2 s . com*/
class ExchangerProducer extends Thread {
  private Exchanger<ArrayList<Integer>> exchanger;
  private ArrayList<Integer> buffer = new ArrayList<Integer>();
  public ExchangerProducer(Exchanger<ArrayList<Integer>> exchanger) {
    this.exchanger = exchanger;
  }
int i=1;
  public void run() {
    while (true) {
      try {
        System.out.println("Producer"+i);
        Thread.sleep(1000);
        fillBuffer();
        System.out.println("Producer"+i+" has produced and waiting:" + buffer);
        buffer = exchanger.exchange(buffer);
        i++;
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void fillBuffer() {
    for (int i = 0; i <= 3; i++) {
      buffer.add(i);
    }
  }
}
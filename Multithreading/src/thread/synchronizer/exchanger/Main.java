package thread.synchronizer.exchanger;

import java.util.concurrent.Exchanger;
import java.util.ArrayList;;

public class Main {
	  public static void main(String[] args) {
	    Exchanger<ArrayList<Integer>> exchanger = new Exchanger<ArrayList<Integer>>();
	    ExchangerProducer producer = new ExchangerProducer(exchanger);
	    ExchangerConsumer consumer = new ExchangerConsumer(exchanger);
	    producer.start();
	    consumer.start();
	  }
	}
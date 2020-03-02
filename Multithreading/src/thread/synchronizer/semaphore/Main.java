package thread.synchronizer.semaphore;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant(5);
	    for (int i = 1; i <= 6; i++) {
	      RestaurantCustomer c = new RestaurantCustomer(restaurant, i);
	      c.start();
	    }

	}

}

package demo.thread.deamon;

public class JavaDaemonThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    Thread dt = new Thread(new DaemonThread(), "dt");
        dt.setDaemon(true); // if set true the deamon thread will terminate with main thread 
        //or else it will continue after main thread also 
        dt.start();
        //continue program
        Thread.sleep(10000);
        System.out.println("Finishing program");
		
	}

}

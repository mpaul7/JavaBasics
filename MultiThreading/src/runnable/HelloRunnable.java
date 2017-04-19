package runnable;

public class HelloRunnable implements Runnable{
	
	public void run()  {
		try{
			Thread.sleep(6000); // sleep mut be in try catch block.
			System.out.println(Thread.interrupted());
			System.out.println("Hello from thread   " + Thread.currentThread().getName());
			}catch(InterruptedException e){
				
			}
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 // The Runnable object is passed to the Thread constructor
		System.out.println(Thread.currentThread().getName());
		new Thread(new HelloRunnable()).start();
		
	}

}

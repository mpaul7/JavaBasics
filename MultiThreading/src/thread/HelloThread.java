package thread;

public class HelloThread extends Thread {

	public void run(){
		System.out.println("from run() in HelloThread");
		}
	
	public static void main(String[] args) {
		(new HelloThread()).start();
	}

}

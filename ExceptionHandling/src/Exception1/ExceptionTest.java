package Exception1;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int [] a = new int[2];
			System.out.println("a[1] = " + a[1]);
			System.out.println("a[3]" + a[3]); // checked exception
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception thrown  :" + e);
			System.out.println("in catch block");
			
		}

	}

}

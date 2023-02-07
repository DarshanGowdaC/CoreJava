package exceptionhandling;

// AritmeticException
public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		divide(1 , 0);
		System.out.println("Main Method Ended");
		
	}
   
	  private static void divide(int i, int j) {
		System.out.println("Divide Method Started");
		try {
			System.out.println(i/j);
		}catch(ArithmeticException b) {
			System.out.println("Cannot Divide given Number by 0");
		}
		System.out.println("Divide Method Ended");
	}

	
	  
}

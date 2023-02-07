package exceptionhandling;

public class Testerr {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			Class cls = Class.forName("exceptionhandling Testerr");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Main Ended");
		}
	}

}

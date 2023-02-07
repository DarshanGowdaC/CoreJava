package exceptionhandling;


//StringIndexOutOfBoundsException 
public class StringValue {
	
	public static void main(String[] args) {
		
		try {
		String str = "Darshan" ;
		}catch(StringIndexOutOfBoundsException a) {
		//System.out.println(str.charAt(11));
			a.printStackTrace();
			System.out.println("Wrong Input");
		
 }
}
}
package exceptionhandling;

import java.io.File;
import java.io.IOException;

public class HayaBusa {
	
	public static void main(String[] args) {
		 System.out.println("ClassNotFoundException Has Started");
		try {
		Class busa = Class.forName("exceptionhandling HayaBusa") ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
			File file = new File("myfile.txt") ;
		
				try {
					file.createNewFile() ;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		}
		System.out.println("ClassNotFoundException is Ended");
	}

}
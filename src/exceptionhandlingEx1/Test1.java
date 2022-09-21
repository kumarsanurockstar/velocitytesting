package exceptionhandlingEx1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

	public static void main(String[] args) {
		 
		
		
		try {
			FileInputStream fis = new FileInputStream ("F:/Epf.text");
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
		
		
		

	}

}

package exceptionhandlingEx1;

public class MethodForprintException {

	public static void main(String[] args) {
		 
		try {
			int a=10;
			int b=0;
			int c=a/b;
		}
		
catch(ArithmeticException e1) // Child Class
		
		{
			e1.printStackTrace();  // it is best way and most preferred way for print
			//Exception Name
			//Discripition 
			//StackTrace
			
			System.out.println("==========================");
			System.out.println(e1);
			//Exception Name
			//Discripition 
			
			
			System.out.println("==========================");
			System.out.println(e1.getMessage());  
			//Discripition 
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

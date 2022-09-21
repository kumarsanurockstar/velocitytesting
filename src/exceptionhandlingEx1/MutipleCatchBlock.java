package exceptionhandlingEx1;

public class MutipleCatchBlock {

	public static void main(String[] args) {
		 
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
		}
		
   catch(ArithmeticException e1) // Child Class
		
		{
			e1.printStackTrace();
			System.out.println("22");	
		}
		
		catch(Exception e) // Parent Class
		
		{
			e.printStackTrace();
			System.out.println("11");	
		}
		
       
		
		
		
		
		
		
		
		
		
		
		
	}

}

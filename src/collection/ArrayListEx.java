package collection;

import java.util.ArrayList;

public class ArrayListEx {

	ArrayListEx ()
	{
		System.out.println("This is default Construtctor");
	}
	
	ArrayListEx(String A)
	{
		System.out.println("This is Overload Construtctor");
	}

	 public void test()
	 {
		 System.out.println("This is Default Non-Static Method");
	 }
	 public void test(int a)
	 {
		 System.out.println("This is Overloded Non-Static Method");
	 }
	
	public static void main(String[] args) {
		
		ArrayListEx obj = new ArrayListEx();
		
		ArrayListEx obj1 = new ArrayListEx("Neha,Arun");
		obj.test();
		obj.test(30);
		
//		ArrayList al= new ArrayList();
//		
//		al.add("Neha");
//		al.add("ravina");
//		al.add(10);
//		al.add("Null");
//		al.add("ravina");
//		al.add("Null");
//		al.add("Arun G");
//		al.add("Amit Sir");
//		al.add("Sanjeev G");
//		al.add("NuLL");
//		System.out.println(al);
//		
//		
//		
//		
//		
//		
//		
//		
		
	}

}

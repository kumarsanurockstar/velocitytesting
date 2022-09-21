package collection;

import java.util.ArrayList;

public class ArraryListCollection {

	public static void main(String[] args) {
		 
		ArrayList l = new ArrayList ();
		
		l.add(10);
		l.add(20);
		l.add("India");
		l.add('A');
		l.add(40.45);
		l.add(null);
		l.add(null);
		l.add(20);
		l.add(40.45);
		System.out.println(l);
		System.out.println(l.size());// size value
		System.out.println(l.get(1));// index value
		l.set(2,"PCMC"); // set method 
		System.out.println(l);
		
		l.remove(3); // remove method
		System.out.println(l);
		System.out.println(l.isEmpty());// empty method 
		System.out.println(l.contains("PCMC"));
		
		//l.clear(); // Clear Method
		//System.out.println(l);
		
	}

}

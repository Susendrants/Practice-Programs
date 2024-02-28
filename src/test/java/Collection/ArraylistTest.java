package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistTest {
	
	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add("susee");
		ar.add(29);
		ar.add("TYSS");
		ar.add("Bangalore");
		ar.add(null);
		ar.add("Hello");
		System.out.println(ar);
		
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(30);
		in.add(28);
		in.add(56);
		in.add(12);
		System.out.println(in);
		
		Collections.sort(in);
		
		
		
		for (Integer i:in)
		{
			
			System.out.println(i);
			
		}
		
		in.remove(1);
		System.out.println(in);
		
		Collections.synchronizedList(in);
		
	}

}

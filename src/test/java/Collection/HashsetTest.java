package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(12);
		hs.add(12);
		hs.add(null);
		hs.add(null);
		hs.add("hello");
		hs.add(10);
		System.out.println(hs);
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(null);
		ar.add(20);
		ar.add(20);
		System.out.println(ar);
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

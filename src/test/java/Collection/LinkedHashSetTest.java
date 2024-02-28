package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Object> hs = new LinkedHashSet<Object>();
		hs.add(26);
		hs.add(21);
		hs.add(null);
		hs.add(21);
		hs.add(null);
		hs.add("Hello");
		System.out.println(hs);
		for(Object ob:hs)
		{
			System.out.println(ob);
		}
		HashSet<Object> e= new HashSet<Object>(hs);
		System.out.println(e);
	}

}

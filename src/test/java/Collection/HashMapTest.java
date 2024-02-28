package Collection;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(111, "susendran");
		hm.put(null, "Susee"); // not allowed
		hm.put(101, "Amar");
		hm.put(155, "Naveen");
		hm.put(134, "Shru");
		hm.put(103, "Shru");
		hm.put(null, "amar");  // based on ascii value it takes null key
	//	hm.put(103,"Shru");   not allowed
		System.out.println(hm.entrySet());
		
		for(Integer k:hm.keySet())
        {
            System.out.println(k);
        }
		
	}

}

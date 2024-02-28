package Collection;

import org.apache.commons.collections4.map.LinkedMap;

public class LinkedMapTest {
public static void main(String[] args) {
	LinkedMap<Integer, String> lm = new LinkedMap<Integer, String>();
	lm.put(26, "Susee");
	lm.put(8, "Amar");
	lm.put(14,"Shru");
	
	System.out.println(lm.entrySet());
	
	
}
}

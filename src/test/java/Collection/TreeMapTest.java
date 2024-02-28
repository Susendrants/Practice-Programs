package Collection;

import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args) {
	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	tm.put(26, "Susee");
	tm.put(8, "Amar");
	tm.put(14,"Shru");
	
	System.out.println(tm.entrySet());
	
}
}

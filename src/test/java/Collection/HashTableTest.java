package Collection;


import java.util.Hashtable;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(101,"Ram");
		hm.put(102,"Laxman");
	//	hm.put(102,"Laxman");  not allowed
		hm.put(103,"Laxman");
		hm.put(104, "Bharathan");
		hm.put(105, "Chanthru");
		
		System.out.println(hm.entrySet());
		
		for(java.util.Map.Entry<Integer, String> map:hm.entrySet())
		{
			System.out.println(map.getKey()+"  "+map.getValue());
		}
		
		for(Integer i:hm.keySet())
		{
			System.out.println(i);
		}

	}

}

package Collection;

import java.util.LinkedList;

public class LinkedlistTest {
	public static void main(String[] args) {
		LinkedList<Object> link = new LinkedList<Object>();
		link.add(30);
		link.add(12);
		link.add("hi");
		link.add(12);
		link.add(null);
		link.add("bye");
		link.add(46);
		link.addFirst("Welcome");
		link.addLast("All the best");
		System.out.println(link);
		link.removeFirst();
		link.removeLast();
		for(Object ob:link)
		{
			System.out.println(ob);
		}
		
	}

}

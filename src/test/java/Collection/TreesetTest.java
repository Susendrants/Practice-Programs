package Collection;

import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
	//	ts.add(null);
		ts.add(30);
	//	ts.add("hi");
		ts.add(12);
		ts.add(8);
	//	ts.add(8);
		ts.add(58);
		System.out.println(ts);

	}

}

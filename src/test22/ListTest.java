package test22;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		/*
		 * ArrayList 
		 * .size() 
		 * .add()
		 */
		List<String> strlist = new ArrayList<String>();
		System.out.println(strlist.size());
		strlist.add("하나");
		System.out.println(strlist.size());
		strlist.add("둘");
		System.out.println(strlist.toString());
	}
}

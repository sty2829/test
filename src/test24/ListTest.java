package test24;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		
		Integer i = numList.get(0);
		
		List<String> strList = new ArrayList<String>();
		
		
		String str = "1";
		String str2 = "2";
		String str1 = new String("2");
		System.out.println(str2==str);
	}
}

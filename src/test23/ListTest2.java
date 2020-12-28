package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		for(int i=5; i<=50; i+=5) {
			strList.add(String.valueOf(i));
		}
		
		int sum = 0;
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		
		for(int i=0; i<strList.size(); i++) {
			sum += Integer.parseInt(strList.get(i));
		}
		
		System.out.println(sum);
		
		
	}
}

package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		for(int i=2; i<=512; i*=2) {
			strList.add(String.valueOf(i));
		}
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}

	}
}

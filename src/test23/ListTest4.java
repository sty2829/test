package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		for(int i=10; i>=-10; i--) {
			strList.add(String.valueOf(i));
		}
		System.out.println(strList);
		strList = new ArrayList<String>(); 
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				strList.add(String.valueOf(i*-1));
			}else {
				strList.add(String.valueOf(i));
			}
		}
		System.out.println(strList);
		
		
	}
}

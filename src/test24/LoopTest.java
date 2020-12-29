package test24;

import java.util.ArrayList;
import java.util.List;

public class LoopTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i=0; i<=9; i++) {
			numList.add((i+1)*100);
		}
		for(Integer num : numList) {
			System.out.println(num);
		}
		
	}
}

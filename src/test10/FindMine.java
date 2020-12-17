package test10;

import java.util.Random;

public class FindMine {

	public static void main(String[] args) {
		String[] strs = new String[5];
		Random r = new Random();
		int mindIdx = r.nextInt(strs.length)+1;
		System.out.println(mindIdx);
		
		for(int i=0; i<strs.length; i++) {
			strs[i] = i+1+"";
			if(strs[i].equals(mindIdx+"")) {
				strs[i] = "꽝";
			}
		}
		
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}

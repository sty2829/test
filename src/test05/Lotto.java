package test05;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];


		
		for(int i=0; i<lotto.length;i++) {
			int rNum = r.nextInt(6) + 1;
			lotto[i] = rNum;
			for(int j=i-1; j>=0; j--) {
				if(rNum==lotto[j]) {
					i--;
					break;
				}
			}	
		}
		
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}

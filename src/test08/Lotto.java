package test08;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();

		for(int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(6)+1;
			for(int j=0; j<i; j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		
	}
}

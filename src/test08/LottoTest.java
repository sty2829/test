package test08;

import java.util.Random;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를,를 구분자로 입력해주세요 : ");
		String str = s.nextLine();
		System.out.println("니가 쓴 숫자들 : " + str);
		String[] strs = str.split(",");
		
		int[] myLotto = new int[strs.length];
		for(int i=0; i<myLotto.length; i++) {
			myLotto[i] = Integer.parseInt(strs[i]);
		}
	
		
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("니가 찍은 번호 : [");
		for(int i=0; i<myLotto.length; i++) {
			System.out.print(myLotto[i] + ",");
		}
		System.out.println("]");
		
		System.out.print("당첨 번호 : [");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + ",");
		}
		System.out.println("]");
	
	}
}

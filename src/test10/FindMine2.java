package test10;

import java.util.Random;
import java.util.Scanner;

public class FindMine2 {

	public static void main(String[] args) {
		String[] strs = new String[10];
		Random r = new Random();
		int mine = r.nextInt(strs.length)+1;
		for(int i=0; i<strs.length; i++) {
			strs[i] = i+1+"";
			if(strs[i].equals(mine+"")) {
				strs[i] = "꽝";
			}
		}
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 1-5를 입력해주세요 :");
		int num = Integer.parseInt(s.nextLine());
		int idx;
		for(int i=0; i<strs.length; i++) {
			if(strs[i].equals("꽝")) {
				idx = i+1;
				if(idx==num) {
					System.out.println("찾았다");
				}else {
					System.out.println("틀렸따");
				}
				break;
			}
		}
	}
}

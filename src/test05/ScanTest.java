package test05;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 살이니?");
		String str = scan.nextLine();
		int num = Integer.parseInt(str);
		if(1<=num && num<200) {
			System.out.println("정상입력!");
		}else
			System.out.println("나이가 제멋대로 이네 이짜슥!!");
		
		
		System.out.println("니가 쓴글 : " + str);
		
		
	}
	
}

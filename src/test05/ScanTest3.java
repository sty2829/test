package test05;

import java.util.Scanner;

public class ScanTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가장 좋아하는 축구 선수는 : ");
		String footBallPlayer = scan.nextLine();
		
		String[] names = {"송흥민","손흔민","송흥밍","손날두"};
		
		for(int i=0; i<names.length; i++) {
			if(footBallPlayer.equals(names[i])) {
				System.out.println("손흥민을 입력하려 하셨구욘?");
			}
		}
		
		
	}
}

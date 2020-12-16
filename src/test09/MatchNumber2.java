package test09;

import java.util.Random;
import java.util.Scanner;

public class MatchNumber2 {

	public static void main(String[] args) {
		Random r = new Random();
		int targetNum = r.nextInt(50)+1;
		Scanner s = new Scanner(System.in);
		for(int i=1; i<=50; i++) {
			System.out.print("번호주세용 : ");
			int myNum = Integer.parseInt(s.nextLine());
			if(targetNum>myNum) {
				System.out.println("UP");
			}else if(targetNum<myNum){
				System.out.println("DOWN");
			}else {
				System.out.println("정답");
				break;
			}
		}
	}
}

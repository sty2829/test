package test01;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();

		if (x % 2 == 0 && y % 2 == 0) {
			System.out.println("짝수+짝수=짝수");
		}else if(x % 2 == 0 && y % 2 ==1) {
			System.out.println("짝수+홀수=홀수");
		}else if(x % 2 == 1 && y % 2 == 0) {
			System.out.println("홀수+짝수=홀수");
		}else {
			System.out.println("홀수+홀수=짝수");
		}
	}
}

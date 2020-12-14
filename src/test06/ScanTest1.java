package test06;

import java.util.Scanner;

public class ScanTest1 {

	public static void main(String[] args) {

		
		System.out.print("첫번째 숫자: ");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		System.out.print("연산자 : ");
		String op = scan.nextLine();
		System.out.print("두번째 숫자: ");
		String str2 = scan.nextLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		if(op.equals("+")) {
			System.out.println(num1+num2);
		}else if(op.equals("-")) {
			System.out.println(num1-num2);
		}else if(op.equals("*")) {
			System.out.println(num1*num2);
		}else if(op.equals("/")) {
			System.out.println(num1/num2);
		}else {
			System.out.println("잘못눌렀나바염");
		}
		
	}
}

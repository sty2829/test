package test05;

import java.util.Scanner;

public class ScanTest4 {
	
	public static void main(String[] args) {
		
		String [] oper = {"+","-","*","/","%"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		String numStr1 = scan.nextLine();
		System.out.print("두번째 숫자: ");
		String numStr2 = scan.nextLine();
		System.out.print("연산자: ");
		String operator = scan.nextLine();
		
		int x = Integer.parseInt(numStr1);
		int y = Integer.parseInt(numStr2);
		
		if(operator.equals("+")) {
			System.out.println(x+y);
		}else if(operator.equals("-")) {
			System.out.println(x-y);
		}else if(operator.equals("*")) {
			System.out.println(x*y);
		}else if(operator.equals("/")) {
			System.out.println(x/y);
		}else if(operator.equals("%")) {
			System.out.println(x%y);
		}else {
			System.out.println("연산자입력다시점..");
		}
		
		
		
		
		
		
		
	}

}

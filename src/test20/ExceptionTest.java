package test20;

import java.util.Scanner;

public class ExceptionTest {
	String str;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ExceptionTest et = new ExceptionTest();
		System.out.print("당신의 나이는? : ");
		String numStr = s.nextLine();
		try {
			int num = Integer.parseInt(numStr);
			System.out.println("아 당신의 나이는 " + num + "살 이군요");
			System.out.println(et.str.equals("허미"));
		}catch(NumberFormatException nfe) {
			System.out.println("하 .. 숫자만 입력하세영..");
		}catch(NullPointerException npe) {
			System.out.println(" 와 널에러 머에영");
		}
	}
}

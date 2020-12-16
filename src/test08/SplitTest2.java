package test08;

import java.util.Scanner;

public class SplitTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(",를 기준으로 숫자만 : ");
		String str = s.nextLine();
		String[] strs = str.split(",");
		
		
	}
}

package test07;

import java.util.Scanner;

public class Multiple {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("몇 단까지 출력할까요 : " );
		String n = s.nextLine();
		int num = Integer.parseInt(n);
		
		for(int i=1; i<=num; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i+" x "+j+" = "+ (i*j));
			}
		}
	}

}

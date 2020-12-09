package test05;

import java.util.Scanner;

public class ScanTest2 {


	public static void main(String[] args) {

		System.out.print("학년 : ");
		Scanner scan = new Scanner(System.in);
		String grade = scan.nextLine();
		int gradeNum = Integer.parseInt(grade);
		if(gradeNum>=1 && gradeNum<=3) {
			}else 
			System.out.println("1-3학년까지만 존재 학년을 잘못입력하셨습니다.");
		System.out.print("반 : ");
		String clazz = scan.nextLine();
		int clazzNum = Integer.parseInt(clazz);
		if(clazzNum<1 && clazzNum>=10 ) {
			System.out.println("1-10반 까지만 존재 반을 잘못입력하셨습니다.");
		}
		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.println(grade + "학년 " + clazz
				+ "반 " + name + "님 반갑습니다.");
	}
}

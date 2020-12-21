package test13;

import java.util.Random;
import java.util.Scanner;

//4번문제
class IntScan{
	
	void printScanner(Scanner scanner) {
		System.out.print("숫자를 입력하세요 :");
		String str = scanner.nextLine();
		String[] strs = new String[str.length()];
		if(setStrs(strs, str)==1) {
			System.out.println(Integer.parseInt(str));
		}else {
			System.out.println("종료");
		}
	}
	int setStrs(String[] strs, String str) {
		for(int i=0; i<strs.length; i++) {
			strs[i] = str.substring(i,i+1);
		}
		return compareStrs(strs);
	}
	
	int compareStrs(String[] strs) {
		String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
		boolean first = strs[0].equals("-");
		boolean hasNum = false;
		for(int i=0; i<strs.length; i++) {
			if(first) {
				++i;
				first = false;
			}
			for(int j=0; j<nums.length; j++) {
				if(strs[i].equals(nums[j])) {
					hasNum = true;
					break;
				}else {
					hasNum = false;
				}
			}
			if(!hasNum) {
				return -1;
			}
		}
		return 1;
	}
}

//2번문제
class SameRandom{
	private Random random = new Random();
	private int[] nums = new int[4];
	
	void setNums() {
		for(int i=0; i<nums.length; i++) {
			nums[i] = random.nextInt(10)+1;
			for(int j=0; j<i; j++) {
				if(nums[i]!=nums[j]) {
					i--;
					break;
				}
			}
		}
	}
	void printNums() {
		for(int num : nums) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}

//1번문제
class Number{
	private int[] nums = new int[25];
	
	void setNums() {
		
		for(int i=0;i<nums.length;	) {
			for(int j=1; j<=9; j++) {
				if(i%2==0)
					if(i<nums.length) {
						nums[i++] = j*100; 
					}else {
						return;
					}
				if(i<nums.length) {
					nums[i++] = j*10;
				}else {
					return;
				}
			}
		}
	}
	void printNums() {
		for(int num : nums) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
public class Homework1219 {

	public static void main(String[] args) {
		Number number = new Number(); // 1번문제 클래스 인스턴스화
		number.setNums(); // 1번문제 int[10]에 숫자 입력.
		number.printNums();
		SameRandom sameRandom = new SameRandom(); // 2번문제 클래스 인스턴스화
		sameRandom.setNums(); // 2번문제 int[4]에 난수 입력.
		sameRandom.printNums();
		//3번문제 오버로딩 정의? : 동일한 의미를 가진 메서드를 다양한 방법으로 표현하려구..?
		IntScan intScan = new IntScan(); //4번문제 클래스 인스턴스화
		Scanner scanner = new Scanner(System.in); // 스캐너 생성
		intScan.printScanner(scanner); // 4번문제 작동
		
	}
}


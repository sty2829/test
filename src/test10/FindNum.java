package test10;

import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		Scanner s = new Scanner(System.in);
		System.out.println("1-5까지의 수 입력: ");
		int num = Integer.parseInt(s.nextLine());
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==num) {
				System.out.println("nums["+i+"]"+"에 있어용");
				break;
			}
		}
		
		for(int n : nums) {
			System.out.println(n);
		}
		
		
	}
}

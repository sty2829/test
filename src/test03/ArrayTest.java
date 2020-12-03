package test03;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		
		int num = 20;
		System.out.println(num);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
	
}
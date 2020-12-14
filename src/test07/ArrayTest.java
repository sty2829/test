package test07;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] nums = new int[5];	
		for(int i=0; i<nums.length; i++) {
			nums[i] = (i+1)*5;
		}	
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}

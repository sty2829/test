package test04;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		//정렬
		//ibit가 표현할수있는건 1과0뿐
		
		//null 값이없는것.
		String str = null;
		System.out.println(str);
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (i+1)*3;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}

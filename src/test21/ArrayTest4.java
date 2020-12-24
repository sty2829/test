package test21;

public class ArrayTest4 {
	
	
	
	public static void main(String[] args) {
		int[] nums = new int[0];
		nums = ArrayUtil.add(nums, 5);
		nums = ArrayUtil.add(nums, 10);
		nums = ArrayUtil.add(nums, 15);
		nums = ArrayUtil.remove(nums);
		ArrayUtil.printArray(nums);

	}
}

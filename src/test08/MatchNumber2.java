package test08;

public class MatchNumber2 {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1,1,2,4};
		int num = 2;
		boolean hasNum = false;
		int n = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==num) {
				n++;
			}
		}
		
		System.out.println(n);
	}

}

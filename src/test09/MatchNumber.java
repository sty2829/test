package test09;

public class MatchNumber {

	public static void main(String[] args) {
		int[] nums = { 1,1,1,1,1,2,2,2,3,4,5 };
		int[] fNums = {1,2,3,4,5}; 
		int[] cnts = new int[fNums.length];

		for(int i =0; i<nums.length; i++) {
			for(int j=0; j<fNums.length; j++) {
				if(nums[i]==fNums[j])
					cnts[j]++;
			}
		}

		for(int i=0; i<cnts.length; i++) {
			System.out.println(cnts[i]);
		}
		
	}
}

package test09;

public class MultipleArray2 {

	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j] = j+1+(i*nums[i].length);
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			for(int n : nums[i]) {
				System.out.println(n);
			}			
		}

	}
}

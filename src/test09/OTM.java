package test09;

import java.util.Random;

public class OTM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Over Time Meal

		int[][] rooms = new int[4][];
		Random r = new Random();
		
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new int[r.nextInt(10) + 1];
			for (int j = 0; j < i; j++) {
				if (rooms[i].length == rooms[j].length) {
					i--;
					break;
				}
			}
		}
		
		int large = rooms[0].length;
		int small = rooms[0].length;
		
		for (int i = 0; i < rooms.length; i++) {
			System.out.println(i + "층 방갯수 : " + rooms[i].length);
		}

		for (int i = 0; i < rooms.length; i++) {
			if(large<rooms[i].length) {
				large = rooms[i].length;
			}
			if(small>rooms[i].length) {
				small = rooms[i].length;
			}
			
		}

		System.out.println(large);
		System.out.println(small);
	}
}

package test09;

import java.util.Random;

public class CountRooms {

	public static void main(String[] args) {
		int[][] rooms = new int[4][];
		int cnt = 1;
		Random r = new Random();
		int n=0;
		
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new int[r.nextInt(10) + 1];
		}

		for (int i = 0; i < rooms.length; i++) {
			System.out.println(i + "층 방갯수 : " + rooms[i].length);
		}
		
		for (int i =0; i< rooms.length; i++) {
			n+=rooms[i].length;
		}
		
		System.out.println("총방갯수    : " + n);
	}
}

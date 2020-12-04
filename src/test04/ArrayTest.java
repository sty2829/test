package test04;

public class ArrayTest {

	public static void main(String[] args) {
		// 예약어
		int[] ints = new int[5];

		for (int i = 100; i <= 500; i += 100) {
			int num = i / 100 - 1;
			int num1 = (i - 100) / 100;
			ints[(i - 100) / 100] = i;
		}
		for (int i=0; i<ints.length;i++) {
			System.out.println(ints[i]);
		}
	}
}

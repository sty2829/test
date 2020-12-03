package test03;

public class ArrayTest4 {

	public static void main(String[] args) {
		boolean[] bls = new boolean[5];
//		bls[0] = true;
//		bls[1] = false;
//		bls[2] = true;
//		bls[3] = false;
//		bls[4] = true;
//		
		for (int i = 0; i < bls.length; i++) {
			bls[i] = i % 2 == 0;
		}
		for (int i = 0; i < bls.length; i++) {
			System.out.println(bls[i]);
		}
//			if (i % 2 == 0) {
//				bls[i] = true;
//				System.out.println(bls[i]);
//			} else {
//				bls[i] = false;
//				System.out.println(bls[i]);
//		}

	}
}

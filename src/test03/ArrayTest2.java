package test03;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] decs = new double[3];
		decs[0] = 1.1;
		decs[1] = 2.2;
		decs[2] = 10.2;
		System.out.println(decs[0]);

		for (int i = 0; i < decs.length; i++) {
			System.out.println(decs[i]);
		}
	}

}

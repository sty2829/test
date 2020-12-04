package test02;

public class GuGuDan {

	public static void main(String[] args) {
		for (int num1 = 9; num1 >= 1; num1 -= 1) {
			System.out.println("====" + num1 + "단" + "====");
			for (int num2 = 9; num2 >= 1; num2 -= 1) {
				System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
			}
		}
	}
}
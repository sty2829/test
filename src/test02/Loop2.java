package test02;

public class Loop2 {
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		System.out.println(num1 + " X " + num2 + " = " + num1*num2);
		
		for(; num2 < 10; num2+=1) {
			System.out.println(num1 + " X " + num2 + " = " + num1*num2);
		}
		
	}

}

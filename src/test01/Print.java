package test01;

public class Print {

	public static void main(String []args) {
		int i = 7;
		int j = 5;
		int sum = i+j;
		
		System.out.println(sum);
		System.out.println(i+j);
		System.out.println(j);
		double dec1 = 1.5;
		double dec2 = 2.5;
		//같은영역에서 변수명 은 중복X
		double decSum = dec1+dec2;
		System.out.println(decSum);
		
		int num = 1 + 1;
		System.out.println(num);
		System.out.println(1!=2);
		
		boolean smart = 1!=2;
		System.out.println(smart);
	}
}

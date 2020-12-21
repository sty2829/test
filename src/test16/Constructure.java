package test16;

public class Constructure {
	
	public Constructure() {
		System.out.println("내가 생성되는 이유는 생성자인데 ... 생성할때 날 무조건 실행하게 되어있어");
		return;
	}
	
	public void con() {
		System.out.println("하이!!");
	}

	public static void main(String[] args) {
		Constructure constructure = new Constructure();//생성자
		constructure.con();
	}
}

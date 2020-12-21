package test14;

class Mother{
	int money = 10000;
	String fName = "송";
	String lName = "정숙";
}

public class Son extends Mother {
	int money = 1000;
	String lName = "경훈";
	
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.fName + son.lName);
	}
}

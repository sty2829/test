package test18;

public class Human implements Action {
	
	public void eat() {
		System.out.println("사람이밥먹음");
	}
	public void sleep() { 
		System.out.println("사람이 잠");
	}
	
	public void walk() {
		System.out.println("사람이 걷고있음");
	}
	public void run() {
		System.out.println("사람이 뜀");
	}
}

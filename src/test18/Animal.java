package test18;

public class Animal implements Action {

	@Override
	public void eat() {
		System.out.println("동물이 밥먹음");
	}

	@Override
	public void sleep() {
		System.out.println("동물이 잠");
	}

	@Override
	public void walk() {
		System.out.println("동물이 걷는다");
	}

	@Override
	public void run() {
		System.out.println("동물이 뜀");
	}

}

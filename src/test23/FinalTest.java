package test23;

final class Single {
	
}

class F {
	public final void test() {
		System.out.println("난 F의 test함수!");
	}
}

public class FinalTest extends F {
	public final int NUMBER_TEST = 10;
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		final int num = 10;
		String str = "";
		Integer i = 1;
	}
}

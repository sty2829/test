package test13;



public class MethodTest {
	
	void test(int i, long b) { 
		System.out.println("test()호출!");
	}
	void test() {
		
	}
	
	void test(String s) {
		System.out.println("하이");
	}
	public static void main(String[] args) {
		MethodTest methodtest = new MethodTest();
		methodtest.test();
		
	}
}

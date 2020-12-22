package test17;

public class ObjectTest {
	
	public String toString() {
		return "급했어~~~";
	}
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		String str = ot.toString();
		System.out.println(ot);
		System.out.println(str);
	}
}

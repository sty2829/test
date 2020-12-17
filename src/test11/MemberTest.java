package test11;

public class MemberTest {
	String name;
	int age;
	
	void run() {
		System.out.println("아 뛰었더니 힘들당~");
	}

	
	public static void main(String[] args) {
		MemberTest memberTest = new MemberTest();
		memberTest.run();
	}
}

package test12;

public class Person {
	String name;
	int age;
	
	void eat() {
		System.out.println(name + "이 밥을 먹습니다.");
	}
	
	void sleep() {
		System.out.println(name + "이 잡니다.");
	}
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "홍길동";
		person.age = 30;
		person.eat();
		person.sleep();
	}
}

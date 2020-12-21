package test14;

class Animal{
	int age;
	String name;
	String type;
	int height;
}

public class Dog extends Animal {
	
	public static void main(String[] args) {
		//개는 동물이라고 부를수있다.
		//동물은 개라고 부를수 없다.
		Animal a = new Dog();
		Animal b = new Cat();
	}
}

package test20;

class Person{
	public String name;
	public int age;
}

public class ArrayTest {

	public static void main(String[] args) {
		Person[] persons = new Person[5];
		
		for(int i=0; i<persons.length; i++) {
			persons[i] = new Person();
			persons[i].name = "이름" + i;
			persons[i].age = i;
		}
		
		for (int i=0; i<persons.length; i++) {
			System.out.println("이름 : " + persons[i].name);
			System.out.println("나이 : " + persons[i].age);
		}
		
	}
}

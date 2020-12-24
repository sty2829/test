package test20;

class Dog{
	String name;
	int age;
	String type;
}

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] names = {"카드1세", "카드2세", "칠복이" ,"백돌이"};
		int[] ages = {23,6,15,11};
		String[] types = {"요쿠셔", "코카", "마르티스" , "시츄"};
		Dog[] dogs = new Dog[3];
		for(int i=0; i<3; i++) {
			double d = Math.random()*names.length;
			int num = (int)d;
			dogs[i] = new Dog();
			dogs[i].name = names[num];
			dogs[i].age = ages[num];
			dogs[i].type = types[num];
		}
		for(int i=0; i<dogs.length; i++) {
			System.out.println("개 이름 " + dogs[i].name + "  개 나이 " + dogs[i].age + " 개 종 " +
					dogs[i].type);
		}
	}
}

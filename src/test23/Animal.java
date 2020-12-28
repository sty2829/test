package test23;

public abstract class Animal {
	public abstract void borned();
	public void died() {
		System.out.println("죽었어..");
	}
}
class Mamals extends Animal {

	@Override
	public void borned() {
		System.out.println("새끼로 태어났어요");
	}
}

class Reptile extends Animal {

	@Override
	public void borned() {
		System.out.println("알로 태어났어요");
	}
}

class excute {
	public static void main(String[] args) {
		Animal animal = new Mamals();
	}
}

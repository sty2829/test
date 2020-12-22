package test17;

class Over {
	public int getInt() {
		return 1;
	}
}
public class Overridng extends Over {
	
	public int getInt() {
		return 20;
	}
	public static void main(String[] args) {
		Over over = new Overridng();
		int num = over.getInt();
		System.out.println(num);
	}
	
}

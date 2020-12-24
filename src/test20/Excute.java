package test20;

class Father {
	void work() {
		System.out.println("아빠가 일함");
	}
}
class Son extends Father {
	void work() {
		System.out.println("아들이 일함");
	}
}
class Daughter extends Father{
	void makeUp() {
		System.out.println("딸이 화장을 함");
	}
	void work() {
		System.out.println("딸이 일함");
	}
}

public class Excute {
	//아들 1명, 딸2명
	public static void main(String[] args) {
		Son s = new Son();
		Daughter d1 = new Daughter();
		Daughter d2 = new Daughter();
		
		Father[] fs = new Father[3];
		fs[0] = s;
		fs[1] = d1;
		fs[2] = d2;
		
		for(int i=0; i<fs.length; i++) {
			if(fs[i] instanceof Daughter) {
				Daughter d = (Daughter)fs[i];
				d.makeUp();
			}
			fs[i].work();
		}
	}
}

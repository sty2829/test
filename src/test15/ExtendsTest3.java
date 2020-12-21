package test15;

public class ExtendsTest3 {

	static void singingSinger(Singer s) {
		s.singing();
	}
	static void test(long i) {
		System.out.println(i);
	}
	static void test1(Momyson m) {
		System.out.println("테스트");
	}
	public static void main(String[] args) {
		Momyson m = new Momyson();
		Ssamd ss = new Ssamd();
		HipHopSinger hhs = new HipHopSinger();
		singingSinger(m);
		singingSinger(ss);
		singingSinger(hhs);
	}
}

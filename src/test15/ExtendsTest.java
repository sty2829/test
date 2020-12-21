package test15;


public class ExtendsTest {

	public static void main(String[] args) {
		Singer s  = new HipHopSinger();
		s = new Ssamd();
		s = new Momyson();
		HipHopSinger hhs = new Ssamd();
		hhs = new Momyson();
		
		
	}
}

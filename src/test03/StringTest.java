package test03;

public class StringTest {

	public static void main(String[] args) {
		String str = "하이요,안녕하세요";
		String search = "하이요,안녕하세오";
		System.out.println(str.indexOf("하이요,안녕하세오"));
		if (str.indexOf(search) == -1) {
			System.out.println("없어요");
		}else {
			System.out.println("있어요");
		}

		int x = 1;
		double y = 2;
		
		System.out.println();
	}
}

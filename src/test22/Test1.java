package test22;

public class Test1 {

	public static void main(String[] args) {
		int i=1;
		String str = (i==1) ? "1이네" : "1아니네";
		Test1 t = new Test1();
		String s = (t==null) ? null : t.toString();
		System.out.println(s);
	}
}

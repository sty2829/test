package test25;

public class ReturnTest {

	String[] strs = {"가","나","다","라"};
	
	int indexOf(String str) {
		for(int i=0; i<strs.length; i++) {
			if(strs[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
		int idx = returnTest.indexOf("나");
		System.out.println(idx);
	}
}

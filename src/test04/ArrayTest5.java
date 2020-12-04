package test04;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";

//		indexOf("문자") = 문자열의 해당 문자 번호를 int로 알려줌 번호는 0번부터 
//						  문자값이 없을경우 -1 

		for (int i = 0; i < strs.length; i++) {
			if (strs[i].indexOf("이") != -1) {
				System.out.println(strs[i]);
			}
		}
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].indexOf("이") == -1) {
				continue;
			}
			System.out.println(strs[i]);
		}
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].indexOf("이") == -1) {
			} else {
			}
			System.out.println(strs[i]);
		}
	}
}

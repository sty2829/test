package test04;

public class ArrayTest4 {

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
//		문자열.length() 문자열의길이 값 (문자열.length() int형) 
//		문자열.indexOf("문자") 해당문자의 길이번호값을 줌 int형 
		String s = "송아지";
		System.out.println(s.length());
		System.out.println(s.indexOf("아"));
		
		for(int i=0; i<strs.length; i++) {
			if(strs[i].length()==2) {
				System.out.println(strs[i]);
			}
		}
	}
}

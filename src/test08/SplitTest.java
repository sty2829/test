package test08;

public class SplitTest {

	public static void main(String[] args) {
		String str = "1000000,23,11,40";
		String[] strs = new String[4];
		int idx;
	
		for(int i=0; i<4; i++) {
			idx = str.indexOf(",");
			if(idx==-1) {
				strs[i] = str;
				break;
			}
			strs[i] = str.substring(0,idx);
			str = str.substring(idx+1);
		}

		
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}

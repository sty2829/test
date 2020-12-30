package test25;

public class MapTest {
	private int size;
	private String[] keys = new String[size];
	private String[] values = new  String[size];
	String put(String key, String value) {
		size ++;
		String[] tmp = keys;
		keys = new String[size];
		for(int i=0; i<tmp.length; i++) {
			keys[i] = tmp[i];
		}
		keys[size-1] = key;
		
		tmp = values;
		values = new String[size];
		for(int i=0; i<tmp.length; i++) {
			values[i] = tmp[i];
		}
		values[size-1] = value;
		
		return key;
	}
	int size() {
		return size;
	}
	
	int indexOf(String key) {
		for(int i=0; i<keys.length; i++) { 
			if(keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	String get(String key) {
		int idx = indexOf(key);
		if(idx==-1) {
			return null;
		}
		return values[idx];
	}
	
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.put("이름", "홍길동");
		mt.put("나이", "55" );
		mt.put("이름", "길동호");
		System.out.println(mt.size());
		System.out.println(mt.get("이름"));
		System.out.println(mt.get("나이"));
	}
}

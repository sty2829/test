package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "서울 동대문구 회기동");
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}

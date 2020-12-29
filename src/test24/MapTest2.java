package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("소주","19도");
		map.put("맥주", "4.5도");
		map.put("사케", "12도");
		map.put("보드카", "53도");
		map.put("빠이주", "65도");
		
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}
}

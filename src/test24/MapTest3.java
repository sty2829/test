package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest3 {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "감자");
		map.put(2, "고구마");
		map.put(3, "옥수수");
		map.put(4, "대추");
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key : " + key + " value : " + map.get(key));
			
		}
	}
}

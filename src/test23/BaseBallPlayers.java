package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseBallPlayers {

	public static void main(String[] args) {
		Map<String,String> lgMap = new HashMap<String,String>();
		lgMap.put("팀명", "LG트윈스");
		lgMap.put("투수", "캘리");
		lgMap.put("타자", "김현수");
		Map<String,String> kiaMap = new HashMap<String,String>();
		kiaMap.put("팀명", "기아타이거즈");
		kiaMap.put("투수", "양현종");
		kiaMap.put("타자", "최형우" );
		Map<String,String> ncMap = new HashMap<String,String>();
		ncMap.put("팀명", "NC다이노스");
		ncMap.put("투수", "구창모");
		ncMap.put("타자", "양의지");
		
		List<Map<String,String>> teams = 
				new ArrayList<Map<String,String>>();
		
		teams.add(lgMap); // 키스트링 밸류스트링 인(in?) 맵 
		teams.add(kiaMap);
		teams.add(ncMap);
		
		for(int i=0; i<teams.size(); i++) {
			System.out.println(teams.get(i).get("투수"));
		}
		
	}
	
}

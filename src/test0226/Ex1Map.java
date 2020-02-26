package test0226;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex1Map {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("가가가", 80);
		map.put("고고고", 90);
		map.put("히히히", 100);
		map.put("마마마", 60);
		map.put("크크크", 80);
		
		System.out.println(map);
		
		//키를 Set으로 가져오기 
		System.out.println("키를 Set으로 가져오기...");
		Set<String> set = map.keySet();
		System.out.println(set); //[크크크, 마마마, 가가가, 히히히, 고고고]
		
		//map의 값을 List로 
		System.out.println("값을 List로 가져오기...");
		List<Integer> list = new LinkedList<>(map.values());
		System.out.println(list);
		
		
		
		System.out.println("map 전체 - 1");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key+"->"+score);
		}
		System.out.println();
		
		for(String s : map.keySet()) {
			int score = map.get(s);
			System.out.println((s+":"+score));
		}
		
		/*
		 * - entry : key와 value를 묶어주기 위해 사용
		 * - Map.Entry 인터페이스
		 * 	키와 값을 Set형태로 저장하기 위해 사용
		 * 
		 * 즉, Map의 Entry (키와 값의 한쌍) 이다. 
		 */
		
		System.out.println("Map.Entry 전체... ");
		
		//*****
		Set<Map.Entry<String, Integer>> set2 =map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2  =set2.iterator();
		
		while(it2.hasNext()) {
			Map.Entry<String, Integer> e = it2.next();
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println();
		
		//값을 컬렉션으로 
		Collection<Integer> col = map.values();
		Iterator<Integer> it3 = col.iterator();
		System.out.println("값을 컬렉션으로...");
		while(it3.hasNext()) {
			int a = it3.next();
			System.out.print(a+" ");
		}
		System.out.println();
		
		System.out.println("최고점수:"+Collections.max(col));
		System.out.println("최저점수:"+Collections.min(col));
		
	}
}

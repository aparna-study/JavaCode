package practice.main;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class MainTest {

	private static void isAnagram() {
		String a = "sarang";
		String b = "gnaars";
		
		if(a == null || b ==null) {
			return;
		}
		
		if(a.length() != b.length()) {
			return;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			int cnt = 0;
			if(map.containsKey(a.charAt(i))) {
				cnt = map.get(a.charAt(i));
			}
			cnt++;
			map.put(a.charAt(i), cnt);
		}
		
		System.out.println("BEFORE "+ map);
		
		for (int i = 0; i < b.length(); i++) {
			int cnt = 0;
			if(map.containsKey(b.charAt(i))) {
				cnt = map.get(b.charAt(i));
				cnt --;
				if(cnt == 0) {
					map.remove(b.charAt(i));
				} else {
					map.put(b.charAt(i), cnt);
				}
			}
		}
		System.out.println("AFTER "+map);
		
		if(map.size() == 0) {
			System.out.println("ANAGRAM :)");
		} else {
			System.out.println("NOT ANAGRAM!!");
		}
	}
	
	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<Integer, String>(10);
		myMap.put(2,"hi");
		String a= myMap.get(2);
		System.out.println("a" +a);
		if(myMap.containsKey(2)){
			System.out.println("Hi");
		}
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		
	}

}

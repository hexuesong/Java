package Day18;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("hahha", "12");
		map.put("xixi", "22");
		map.put("hehe", "42");
		
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(key+"="+value);
		}
		
	}
}

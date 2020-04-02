package Day18;

import java.util.Scanner;
import java.util.TreeMap;

public class MapTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		TreeMap<Character, Integer> tree = new TreeMap<Character, Integer>();
		
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		
		String s = scanner.nextLine();
		
		char[] c = s.toCharArray();
		for (char ch : c) {
			// char key = ch;
			if (tree.get(ch) == null) {
				tree.put(ch, 1);
			}else {
				tree.put(ch, tree.get(ch)+1);
			}
			
		}
		StringBuilder sb = new StringBuilder();
		
		for(Character key : tree.keySet()){
			Integer value = tree.get(key);
			sb.append(key).append("(").append(value).append(")");
//			System.out.println(key+"___"+value);
		}
		System.out.println(sb.toString());
	}
}

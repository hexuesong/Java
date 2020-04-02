package Day14;

import java.util.Arrays;

public class RegexTest {
	public static void main(String[] args) {
		String string = "91 27 46 39 50";
		
		String[] stringArray = string.split(" ");
		
		int[] array = new int[stringArray.length];
		for(int x=0;x<stringArray.length;x++){
			array[x] = Integer.parseInt(stringArray[x]);
		}
		
		Arrays.sort(array);
		
		StringBuilder stringBuilder = new StringBuilder();
		for(int y=0;y<array.length;y++){
			stringBuilder.append(array[y]).append(" ");
		}
		String result = stringBuilder.toString().trim();
		System.out.println(result);
	}
}

package Day16;

import java.util.ArrayList;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("haha");
		list.add("hehe");
		list.add("xixi");
		
		if(!(list==null)){
			for(String string : list){
				System.out.println(string);
			}
		}
		
	}
}

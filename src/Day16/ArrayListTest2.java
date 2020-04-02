package Day16;

import java.util.ArrayList;
import java.util.Iterator;

public interface ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("world");
		list.add("world");
		list.add("world");
		list.add("world");
		list.add("java");
		list.add("java");
		list.add("java");
		list.add("java");
		
		for(int x=0;x<list.size()-1;x++){
			for(int y=x+1;y<list.size();y++){
				if(list.get(x).equals(list.get(y))){
					list.remove(y);
					y--;
				}
			}
		}
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}

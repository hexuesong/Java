package Day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		//Create Collection Object
		Collection collection = new ArrayList();
		//Create Student Object 
		Student student = new Student("张三",12);
		Student student2 = new Student("李四",13);
		
		//Add ArrayList
		collection.add(student);
		collection.add(student2);
		
		//Create Iterator Object
		Iterator iterator = collection.iterator();
		//Ergodic ArrayList
		while(iterator.hasNext()){
			Student s = (Student)iterator.next();
			System.out.println(s.getName()+s.getAge());
		}
	}
}

package Day16;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListTest {
	public static void main(String[] args) {
		LinkedList like = new LinkedList();
		Student s1 = new Student("joly",12);
		Student s2 = new Student("bear",14);
		Student s4 = new Student("jake",114);
		
		like.add(s1);
		like.add(s2);
		like.add(s4);
		
		Iterator iterator = like.iterator();
		while(iterator.hasNext()){
			Student student = (Student)iterator.next();
			System.out.println(student.getName()+"-----"+student.getAge());
		}
	}
}

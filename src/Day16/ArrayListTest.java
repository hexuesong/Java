package Day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Student> array= new ArrayList<Student>();
		
		Student s1 = new Student("joly",12);
		Student s2 = new Student("bear",14);
		Student s4 = new Student("jake",114);
		
		array.add(s1);
		array.add(s2);
		array.add(s4);
		
		Iterator iterator = array.iterator();
		while(iterator.hasNext()){
			Student student = (Student)iterator.next();
			System.out.println(student.getName()+"-----"+student.getAge());
		}
		
		//ÔöÇ¿for
		if(array!=null){
			for(Student student1 : array){
				System.out.println(student1.getName()+"----"+student1.getAge());
			}
		}
	}
}

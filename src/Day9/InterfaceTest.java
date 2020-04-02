package Day9;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Student2("haha",12);
		person.eat();
		person.sleep();
		System.out.println(person.getName()+"---"+person.getAge());
		System.out.println("------------");
		
		person = new Teacher("hehe",13);
		person.eat();
		person.sleep();
		System.out.println(person.getName()+"---"+person.getAge());
		System.out.println("------------");
		
		TeacherSmoking teacher = new TeacherSmoking("xixi",14);
		teacher.eat();
		teacher.sleep();
		teacher.smoking();
		System.out.println(person.getName()+"---"+person.getAge());
		System.out.println("------------");
	}

}

package Day10;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete athlete = new Paddler("Mr.zhang", 18);
		athlete.eat();
		athlete.sleep();
		athlete.drill();
		Paddler paddler = (Paddler)athlete;
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		paddler.study();
		
		System.out.println(athlete.getName()+"---"+athlete.getAge());
	}

}

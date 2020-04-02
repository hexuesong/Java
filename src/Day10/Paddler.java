package Day10;

public class Paddler extends Athlete implements StudyEnglish {
	public Paddler() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Paddler Study English");
	}

	public Paddler (String name, int age) {
		// TODO Auto-generated method stub
		super(name, age);
	}
	public void eat() {
		System.out.println("Paddler eat DuckEgg");
	}
	@Override
	public void drill() {
		// TODO Auto-generated method stub
		System.out.println("Drill Paddler");
	}

}

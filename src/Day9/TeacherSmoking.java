package Day9;

public class TeacherSmoking extends Teacher implements InterfaceSmoking {

	private void TacherSmoking() {
		// TODO Auto-generated method stub

	}
	
	public TeacherSmoking(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void smoking() {
		// TODO Auto-generated method stub
		System.out.println("ÀÏÊ¦³é²Êµû");
	}

}

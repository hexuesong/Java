package Day9;

public abstract class Student {
	// ����
	private String name;
	// ����
	private int age;
	// �༶
	private String grand;

	public Student(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrand() {
		return grand;
	}

	public void setGrand(String grand) {
		this.grand = grand;
	}

	public Student(String name, int age, String grand) {
		super();
		this.name = name;
		this.age = age;
		this.grand = grand;
	}
	//���󷽷�ѧϰ
	public abstract void study();
	//���������Է�
	public void eat(){
		System.out.println("�������ˣ��ͺȶ�������");
	}
}

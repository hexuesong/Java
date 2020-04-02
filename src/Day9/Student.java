package Day9;

public abstract class Student {
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 班级
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
	//抽象方法学习
	public abstract void study();
	//公共方法吃饭
	public void eat(){
		System.out.println("累了困了，就喝东鹏特饮");
	}
}

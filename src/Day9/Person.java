package Day9;

abstract class Person {
	// 姓名
	private String name;
	// 年龄
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
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
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void eat();

	public void sleep() {
		System.out.println("累了困了，就喝东鹏特饮");
	}
}

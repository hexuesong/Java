package Day8;

public class ExtendsDemo1 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("¹þ¹þ");
		student.setAge(12);
		student.setSex("ÄÐ");
		System.out.println(student.getAge()+"---"+student.getName()+"----"+student.getSex());
		
		Teacher teacher = new Teacher();
		teacher.setName("ºÇºÇ");
		teacher.setAge(13);
		teacher.setSex("Å®");
		System.out.println(teacher.getAge()+"---"+teacher.getName()+"----"+teacher.getSex());
	}
}

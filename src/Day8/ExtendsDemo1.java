package Day8;

public class ExtendsDemo1 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("����");
		student.setAge(12);
		student.setSex("��");
		System.out.println(student.getAge()+"---"+student.getName()+"----"+student.getSex());
		
		Teacher teacher = new Teacher();
		teacher.setName("�Ǻ�");
		teacher.setAge(13);
		teacher.setSex("Ů");
		System.out.println(teacher.getAge()+"---"+teacher.getName()+"----"+teacher.getSex());
	}
}

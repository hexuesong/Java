package Day7;

public class PhoneTest {
	public static void main(String[] args) {
		Phone phone = new Phone();
		System.out.println(phone.getBrand()+"----"+phone.getColor()+"----"+phone.getPrice());

		phone.setBrand("Huawei");
		phone.setColor("black");
		phone.setPrice(4999);
		System.out.println(phone.getBrand()+"----"+phone.getColor()+"----"+phone.getPrice());
	}
}

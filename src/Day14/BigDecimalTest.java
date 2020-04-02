package Day14;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		System.out.println(0.01 + 0.09);
		BigDecimal big = new BigDecimal("0.01");
		BigDecimal big2 = new BigDecimal("0.09");
		System.out.println(big.add(big2));
		
	}
}

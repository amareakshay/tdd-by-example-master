package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {
	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
	//*	Dollar product = five.times(2);
		five.times(2);
		assertEquals(10,five.amount);
	/*	product = five.times(3);
		assertEquals(15,product.amount);*/
	}
	
}
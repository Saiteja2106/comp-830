package hw6;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class OrderDieTest {
	
	@Test
	void test1() {
		OrderDie d = new OrderDie("Steve", "Red");
		String s = d.toString();
		assertEquals("Steve Red", s);
	}

	
	@Test
	void test2() {
		OrderDie d = new OrderDie("Tom", "Red");
		String s = d.toString();
		assertEquals("Tom Red", s);
	}

	@Test
	void test3() {
		OrderDie d = new OrderDie("Steve", "Yellow");
		String s = d.toString();
		assertEquals("Steve Yellow", s);
	}
}

		
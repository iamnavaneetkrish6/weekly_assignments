package tesr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calci.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
	   Calculator cal=new Calculator();
	   int actual=cal.add(4, 5);
	   assertEquals(9,actual);
		
	}

	@Test
	void testSub() {
		Calculator cal=new Calculator();
		   int actual=cal.sub(4, 5);
		   assertNotEquals(-1,actual);
	}

}

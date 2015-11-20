package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesterClass {
	
	@Test
	public void testMultiply() {
		TestClass t = new TestClass(2, 3);
		
		assertEquals(t.multiply(), 6);
		
	}

}

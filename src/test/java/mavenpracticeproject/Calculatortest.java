package mavenpracticeproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculatortest {
@Test
public void testadd()
{
	assertEquals(7,Calculator.add(5, 2));
	assertEquals(-5,Calculator.add(-7, 2));
}
@Test
public void testsubstract()
{
	assertEquals(5,Calculator.substract(7, 2));
	assertEquals(-2,Calculator.substract(-4, -2));
}
@Test
public void testmultiply()
{
	assertEquals(50,Calculator.multiply(10, 5));
	assertEquals(-6,Calculator.multiply(2, -3));
}
@Test
public void testdivide()
{
	assertEquals(5,Calculator.divide(50, 10));
	assertEquals(-3,Calculator.divide(-9, 3));
}
}

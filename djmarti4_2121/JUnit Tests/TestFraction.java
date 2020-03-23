import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;//Comment this out and uncomment
//import junit.framework.* and extends TestCase and things will also work

//import junit.framework.*;//Makes TestCase and Asserts work

public class TestFraction //extends TestCase
{
	private Fraction normalFraction;
	private Fraction zeroFraction;
	private Fraction negativeFraction;
	private Fraction bigFraction;
	
	@Before
	public void setUp()
	{
		normalFraction =  new Fraction(2,3);
		zeroFraction = new Fraction(0,4);
		negativeFraction = new Fraction(-1,2);
		bigFraction = new Fraction(7,5);
	}
	
	@Test
	public void testAdd()
	{
		Fraction tempFraction = new Fraction (-4,8);
		assertEquals(tempFraction.getNumerator(), negativeFraction.add(zeroFraction).getNumerator());
		assertTrue(tempFraction.getDenominator() == negativeFraction.add(zeroFraction).getDenominator());
	}
	
	@Test
	public void testSubtract()
	{
		Fraction tempFraction = new Fraction (0,4);
		assertEquals(tempFraction.getNumerator(), negativeFraction.subtract(negativeFraction).getNumerator());
		assertTrue(tempFraction.getDenominator() == negativeFraction.subtract(negativeFraction).getDenominator());
	}
	
	@Test
	public void testDivide()
	{
		boolean trueException = false;
		
		Fraction notAFraction = new Fraction (0,0);
		
		try
		{
			bigFraction.divide(notAFraction);
		}
		catch (ArithmeticException e)
		{
			trueException = true;
		}
		
		assertTrue(trueException);
		
		Fraction tempFraction = new Fraction(21,10);
		assertTrue(tempFraction.getNumerator() == bigFraction.divide(normalFraction).getNumerator());
		assertTrue(tempFraction.getDenominator() == bigFraction.divide(normalFraction).getDenominator());
	}
	
	@Test
	public void testMultiply()
	{
		Fraction tempFraction = new Fraction(1,1);
		assertEquals(zeroFraction.getNumerator(), zeroFraction.multiply(tempFraction).getNumerator());
		assertTrue(zeroFraction.getDenominator() == zeroFraction.multiply(tempFraction).getDenominator());
	}
	
}

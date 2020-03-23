import static org.junit.Assert.*;
import org.junit.*;

public class ComplexNumberTests {

	ComplexNumber zero;
	ComplexNumber neg;
	ComplexNumber imag;
	ComplexNumber real;
	ComplexNumber tempComplex;

    @Before
    public void setup() {
	zero = new ComplexNumber(0.0f , 0.0f);
	neg  = new ComplexNumber(3.0f , -1.0f);
	imag = new ComplexNumber(5.0f , 2.0f);
	real = new ComplexNumber(2.0f , 3.0f);
    }

	@Test
	public void testAdd() {
		
		tempComplex = zero.add(zero);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.add(neg);
		assertEquals(3.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-1.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.add(imag);
		assertEquals(5.0f, tempComplex.getA(), 0.0001f);
		assertEquals(2.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.add(real);
		assertEquals(2.0f, tempComplex.getA(), 0.0001f);
		assertEquals(3.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.add(neg);
		assertEquals(6.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-2.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.add(imag);
		assertEquals(8.0f, tempComplex.getA(), 0.0001f);
		assertEquals(1.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.add(real);
		assertEquals(5.0f, tempComplex.getA(), 0.0001f);
		assertEquals(2.0f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.add(imag);
		assertEquals(10.0f, tempComplex.getA(), 0.0001f);
		assertEquals(4.0f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.add(real);
		assertEquals(7.0f, tempComplex.getA(), 0.0001f);
		assertEquals(5.0f, tempComplex.getB(), 0.0001f);

		tempComplex = real.add(real);
		assertEquals(4.0f, tempComplex.getA(), 0.0001f);
		assertEquals(6.0f, tempComplex.getB(), 0.0001f);
	}

	@Test
	public void testSubtract() {
		tempComplex = zero.subtract(zero);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.subtract(neg);
		assertEquals(-3.0f, tempComplex.getA(), 0.0001f);
		assertEquals(1.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.subtract(imag);
		assertEquals(-5.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-2.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.subtract(real);
		assertEquals(-2.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-3.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.subtract(neg);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.subtract(imag);
		assertEquals(-2.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-3.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.subtract(real);
		assertEquals(1.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-4.0f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.subtract(imag);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.subtract(real);
		assertEquals(3.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-1.0f, tempComplex.getB(), 0.0001f);

		tempComplex = real.subtract(real);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);
	
	}

	@Test
	public void testMultiply() {
		tempComplex = zero.multiply(zero);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.multiply(neg);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.multiply(imag);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.multiply(real);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.multiply(neg);
		assertEquals(8.0f, tempComplex.getA(), 0.0001f);
		assertEquals(-6.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.multiply(imag);
		assertEquals(17.0f, tempComplex.getA(), 0.0001f);
		assertEquals(1.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.multiply(real);
		assertEquals(9.0f, tempComplex.getA(), 0.0001f);
		assertEquals(7.0f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.multiply(imag);
		assertEquals(21.0f, tempComplex.getA(), 0.0001f);
		assertEquals(20.0f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.multiply(real);
		assertEquals(4.0f, tempComplex.getA(), 0.0001f);
		assertEquals(19.0f, tempComplex.getB(), 0.0001f);

		tempComplex = real.multiply(real);
		assertEquals(-5.0f, tempComplex.getA(), 0.0001f);
		assertEquals(12.0f, tempComplex.getB(), 0.0001f);
	
	}

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		tempComplex = zero.divide(zero);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);
		assertTrue(true);

		tempComplex = zero.divide(neg);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.divide(imag);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = zero.divide(real);
		assertEquals(0.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.divide(neg);
		assertEquals(1.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.divide(imag);
		assertEquals(0.4482758621f, tempComplex.getA(), 0.0001f);
		assertEquals(-0.3793103448f, tempComplex.getB(), 0.0001f);

		tempComplex = neg.divide(real);
		assertEquals(0.2307692308f, tempComplex.getA(), 0.0001f);
		assertEquals(-0.8461538462f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.divide(imag);
		assertEquals(1.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);

		tempComplex = imag.divide(real);
		assertEquals(1.230769231f, tempComplex.getA(), 0.0001f);
		assertEquals(-0.8461538462f, tempComplex.getB(), 0.0001f);

		tempComplex = real.divide(real);
		assertEquals(1.0f, tempComplex.getA(), 0.0001f);
		assertEquals(0.0f, tempComplex.getB(), 0.0001f);
	
	}
}
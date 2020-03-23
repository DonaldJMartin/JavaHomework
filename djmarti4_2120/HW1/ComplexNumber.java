/**
* @author DonaldMartin
* @version 1.0
* @since 01-05-2019
*/

public class ComplexNumber {

	// The instance variables a and b representing
	// the real parts of the complex number
	private float a;
	private float b;

	/**
	* This constructs our complex numbers.
	* @param a is our first complex number
	* @param b is our second complex number
	*/
	public ComplexNumber(float a, float b) {
		this.a = a;
		this.b = b;
	}

	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}

	/**
	* @param otherNumber is adding complex numbers together
	*/
	public ComplexNumber add (ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		// float c = otherNumber.getA();
		// float d = otherNumber.getB();
		float newA = a + otherNumber.getA();
		float newB = b + otherNumber.getB();
		newComplex = new ComplexNumber (newA, newB);
		return newComplex;
	}

	/**
	* @param otherNumber is subtracting complex numbers together
	*/
	public ComplexNumber subtract (ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		// float c = otherNumber.getA();
		// float d = otherNumber.getB();
		float newA = a - otherNumber.getA();
		float newB = b - otherNumber.getB();
		newComplex = new ComplexNumber (newA, newB);
		return newComplex;
	}

	/**
	* @param otherNumber is multiplying complex numbers together
	*/
	public ComplexNumber multiply (ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		// float c = otherNumber.getA();
		// float d = otherNumber.getB();
		float newA = (a * otherNumber.getA()) - (b * otherNumber.getB()) ;
		float newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
		newComplex = new ComplexNumber (newA, newB);
		return newComplex;
	}

	/**
	* @param otherNumber is dividing complex numbers together
	*/
	public ComplexNumber divide (ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		// float c = otherNumber.getA();
		// float d = otherNumber.getB();
		float sqrs = (otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB());
		
		if (sqrs == 0.0f) {
			throw new ArithmeticException();
		}
		
		else {
			float newA = (a * otherNumber.getA() + b * otherNumber.getB()) / sqrs;
			float newB = (b * otherNumber.getA() - a * otherNumber.getB()) / sqrs;
			newComplex = new ComplexNumber (newA, newB);
		}

		return newComplex;
	}

	/**
	* @param otherNumber tests is the complex numbers are equal
	*/
	@Override
	public boolean equals (Object otherNumber) {
		if (otherNumber instanceof ComplexNumber){
			ComplexNumber o = (ComplexNumber) otherNumber;
		
			if (a == o.getA() && b == o.getB()) {
			return true;
			}
		}
		return false;
	}

	// this will return our final answer to a String
	@Override
	public String toString () {
		return this.a + " " + "+ " + this.b + "i";
		
	}

}
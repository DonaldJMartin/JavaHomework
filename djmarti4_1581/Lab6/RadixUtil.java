public class RadixUtil {
	
	public static int base2(String binary) {
		int decimal = Integer.parseInt(binary, 2);
		return decimal; 
	}

	public static String base2(int decimal) {
		String decimal2 = Integer.toString(decimal, 2);
		return decimal2;
	}

	public static int base8(String octal) {
		int octa = Integer.parseInt(octal, 8);
		return octa;
	}

	public static String base8(int decimal) {
		String decimal3 = Integer.toString(decimal, 8);
		return decimal3;
	}

	public static int base16(String hexadecimal) {
		int hexa = Integer.parseInt(hexadecimal, 16);
		return hexa;
	}

	public static String base16(int decimal) {
		String decimal4 = Integer.toString(decimal, 16);
		return decimal4;
	}
}
public class LogicalUtil {
	
	public static boolean thereExists(boolean p, boolean q, boolean r) {
		if (p == true || q == true || r == true) {
		return true;
		}
		return false;
	} //end thereExists

	public static boolean forAll(boolean p, boolean q, boolean r) {
		if (p == true && q == true && r == true) {
			return true;
		}
		return false;
	} //end forAll

	public static boolean majority(boolean p, boolean q, boolean r) {
		if (p == true && q == true) {
			return true;
		}

		if (p == true && r == true) {
			return true;
		}

		if (q == true && r == true) {
			return true;
		}
		return false;
	} //end majority

	public static boolean minority(boolean p, boolean q, boolean r) {
		if (p == false && q == false) {
			return true;
		}

		if (p == false && r == false) {
			return true;
		}

		if (q == false && r == false) {
			return true;
		}
		return false;
	} //end minority

	public static boolean implies(boolean p, boolean q) {
		if (p == true && q == false) {
			return false;
		}
		return true;
	}

	public static boolean implies(boolean p, boolean q, boolean r) {
		if (p == true && q == true && r == false) {
			return false;
		}
		return true;
	}
}
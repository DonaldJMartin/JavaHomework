public class RelationalUtil {
	
	public static boolean isIncreasing(int x, int y, int z) {
		if (x < y && y < z) {
			return true;
		}
		return false;
	}

		public static boolean isDecreasing(int x, int y, int z) {
			if (x > y && y > z){
				return true;
			}
			return false;
		}

		public static boolean isBetween(int x, int y, int z) {
			if (x <= y && y <= z) {
				return true;
			}
			return false;
		}

		public static boolean isPositive(int x) {
			if (x >= 0) {
				return true;
			}
			return false;
		}

		public static boolean isNegative(int x) {
			if (x < 0) {
				return true;
			}
			return false;
		}

		public static boolean overlaps(int min1, int max1, int min2, int max2) {
			if (max2 < min1 || max1 < min2) {
				return false;
			}
			return true;
		}
}
public class Time {
	
	public static double secondsToMinutes(int seconds) {
		return (seconds / 60.0);
	}

	public static double secondsToHours(int seconds) {
		return secondsToMinutes(seconds) / 60.0;
	}

	public static double secondsToDays(int seconds) {
		return secondsToHours(seconds) / 24.0;
	}

	public static double secondsToYears(int seconds) {
		return secondsToDays(seconds) / 365;
	}

	public static double minutesToSeconds(double minutes) {
		return minutes * 60;
	}

	public static double hoursToSeconds(double hours) {
		double min = hours * 60;
		return minutesToSeconds(min);
	}

	public static double daysToSeconds(double days) {
		double day = days * 24;
		return hoursToSeconds(day);
	}

	public static double yearsToSeconds(double years) {
		double year = years * 365;
		return daysToSeconds(year);
	}
}
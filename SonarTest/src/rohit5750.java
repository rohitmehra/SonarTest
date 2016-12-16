import java.util.Calendar;
import java.util.GregorianCalendar;

public class rohit5750 {
	private static int count = 0;
	Calendar c = new GregorianCalendar(2014, 12, 25);
	int y;

	public void dob() {
		int x;
		if (c.get(Calendar.MONTH) == 12)
			x = 1;
	}

	public void setname() {
		int a;
	}

	public boolean check(boolean a) {
		return a;
	}

	public void numberOfStudent() {
		if (2 < 3) {
			setname();
		}
		if (check(true) | check(false))
			count++;

		try {
			y = count / 0;
			throw new IllegalArgumentException();
		} finally {

			throw new RuntimeException();
		}

	}
}

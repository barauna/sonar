package principal;

import java.util.Date;

public class MyDate {

	public int compareTo(Date date1, Date date2) {
		if (date1.getYear() == date2.getYear() &&
				date1.getMonth() == date2.getMonth() && 
				date1.getDate() == date2.getDate()) {
			return 0;
		} else if (date1.getYear() < date1.getYear()
				|| (date1.getYear() == date2.getYear() && date1.getMonth() < date2.getMonth())
				|| (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth()
						&& date1.getDate() < date2.getDate())) {
			return -1;
		} else {
			return 1;
		}
	}
}

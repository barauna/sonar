package teste;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import principal.MyDate;

class PrincipalTest {

	@Test
	void test() {
		MyDate date = new MyDate();
		Date date1 = new Date(2022, 7, 10);
		Date date2 = new Date(2023, 7, 5);

		assertTrue(date.compareTo(date1, date2) == -1);;
	}

}

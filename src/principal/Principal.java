package principal;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		Date date1 = new Date(2022, 7, 10);
		Date date2 = new Date(2023, 7, 5);
		int resultado = date.compareTo(date1, date2);
		System.out.printf("resultado: %s", resultado);

	}

}

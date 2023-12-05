package pruebas;

import java.time.LocalDate;

public class Test3 {

	public static void main(String[] args) {
		p(LocalDate.now());

	}
	public static void p(Object obj) {
		if (!(obj instanceof LocalDate date))
			System.out.println("entra");
		else
			System.out.println(date);
	}

}

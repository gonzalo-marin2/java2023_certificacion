package pruebas;

import java.time.LocalDate;

public class TestInstance {

	public static void main(String[] args) {
	}
	
	//ver preguntas dudosas 26
	
		/*public void m(Object obj) {
			if (obj instanceof LocalDate date)
				System.out.println(date);
			else
				System.out.println(date);
		}*/

		/*public void n(Object obj) {
				if (obj instanceof LocalDate date)
					return;
				else
					System.out.println(date);
		}*/

		/*public void o(Object obj) {
			if (!obj instanceof LocalDate date)
				return;
			else
				System.out.println(date);
		}*/

		public void p(Object obj) {
			if (!(obj instanceof LocalDate date))
				return;
			else
				System.out.println(date);
		}

		/*public void q(Object obj) {
			if (!obj instanceof LocalDate date)
				return;
			System.out.println(date);
		}*/

		public void r(Object obj) {
			if (!(obj instanceof LocalDate date))
				return;
			System.out.println(date);
		}
		
		/*Methods m() and n() do not compile because date is not in scope in the else block.
Methods o() and q() do not compile due to the missing parentheses when negating
instanceof. Methods p() and r() do compile, which makes option C the answer.*/

	

}

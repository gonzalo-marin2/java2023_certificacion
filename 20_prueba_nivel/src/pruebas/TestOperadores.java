package pruebas;

public class TestOperadores {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		int c=b++>a?--a:b++;
		//compara 2, por lo que devuelve false e incrementa b en uno. Como es false pasa de --a y asigna b a c e incrementa b
		//b=4; c=3; a=2
		System.out.println(c);

	}

}

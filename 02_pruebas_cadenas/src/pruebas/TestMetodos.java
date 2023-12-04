package pruebas;

public class TestMetodos {

	public static void main(String[] args) {
		String cad="hello ";
		String b="hello";
		System.out.println(b==cad.trim());
		//al no ser el mismo objeto, dará falso
		
		String x="car";
		x.toUpperCase();
		System.out.println(x.equals("CAR"));
		//dará false, genera una nueva cadena, x permanece inmutable, es un objeto
	}

}

package pruebas;

public class TestInicializacion {

	static int a;
	static char b;
	static boolean c;
	static double d;
	static String s;
	static Integer r;
	
	public static void main(String[] args) {
		//int e;==>da error, no está inicializada
		System.out.println(a+","+b+","+c+","+d+","+s+","+r);
		//Salida: 0, ,false,0.0,null,null

	}

}

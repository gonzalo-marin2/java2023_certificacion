package pruebas;

public class Test {

	public static void main(String[] args) {
		String cad="""
				hello
				by
				""";
		
		System.out.println(cad.length());
		//hay dos saltos de línea: después de hello y después de by
		
		String sql="""
				select * from \
				Empleados \
				where nombre="paco"
				""";
		System.out.println(sql);
		// con la barra anulas el salto de línea
		//con \s eliminamos los espacios antes del salto de línea

	}

}

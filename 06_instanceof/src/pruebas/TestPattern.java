package pruebas;

public class TestPattern {

	public static void main(String[] args) {
		Object ob=10;
		//convertimos un primitivo en un object
		
		//matching patterns
		if(ob instanceof Integer in  || ob instanceof Number n) {
			System.out.println("Entra");
			//System.out.println(in);
			//System.out.println(n);
			//Una sí que asigna, dos variables a la vez, no
		}
		
		if(ob instanceof Integer in  && ob instanceof String n) {
			System.out.println("Entra2");
		}
		
		if(ob instanceof String in  || ob instanceof Integer n) {
			System.out.println("Entra3");
		}

	}

}

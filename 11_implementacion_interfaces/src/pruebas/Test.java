package pruebas;

interface I1{
	default void m() {
		
	}
}

interface I2{
	default void m() {
		
	}
}
//no compila pq implementa 2 interfaces que tienen el mismo método.
//Solución: volver a escribir el método

public class Test implements I1,I2{
	
	public void m() {
		
	}
	
}

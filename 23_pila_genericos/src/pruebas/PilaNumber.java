package pruebas;

import java.util.ArrayList;

/*Crear la clase PilaNumber
La clase PilaNumber nos permitirá apilar números, por lo que se implementará con tipos genéricos.
Métodos:
agregar. Recibe el número y lo guarda en la pila
sacar. Devuelve y elimina de la pila el último número introducido
total. Devuelve el total de números que hay en la pila
sum(). Devuelve la suma en tipo float de todos los números.*/

public class PilaNumber<T extends Number> {
	ArrayList<T> guardados=new ArrayList<T>();
	
	public void agregar(T dato) {
		guardados.add(dato);
	}
	
	public T sacar() {
		return guardados.remove(guardados.size()-1);
	}
	
	public int total() {
		return guardados.size();
	}
	
	public double sum() {
		double suma=0;
		for(T dato:guardados) {
			suma+=dato.doubleValue();
		}
		return suma;
	}

}

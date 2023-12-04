package pruebas;

/*Crear la clase Pila 
La clase Pila nos permitirá apilar cualquier tipo Java, por lo que se implementará con tipos genéricos.
Métodos:
agregar. Recibe el dato y lo guarda en la pila
sacar. Devuelve y elimina de la pila el último elemento introducido
total. Devuelve el total de elementos que hay en la pila*/

import java.util.ArrayList;

public class Pila<T> {
	ArrayList<T> guardados=new ArrayList<T>();
	public void agregar(T dato) {
		guardados.add(dato);
	}
	
	public T sacar() {
		return guardados.remove(guardados.size()-1);//elimina el último==>el tamaño del array menos 1
	}
	
	public int total() {
		return guardados.size();
	}
}

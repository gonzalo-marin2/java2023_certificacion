package pruebas;

import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		//quitar duplicados y negativos, ordenar y mostrar
		
		st
		.parallel()
		.distinct()//Stream paralelo
		.filter(n->n>0)//Stream paralelo
		.sorted()//Stream paralelo aquí están ordenados, pero sin el sequential cada tarea te imprime uno
		.sequential()//se convierte a secuencial, UN ÚNICO hilo
		.forEach(System.out::println);//Stream secuencial
		//forEachOrdered saca los números ordenados originalmente, lo hace en un único hilo aunque el stream sea paralelo

	}

}

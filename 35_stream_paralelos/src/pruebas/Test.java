package pruebas;

import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		/*System.out.println(st
				.parallel()//Stream<Integer>
				.count());*/
		
		/*st
		.parallel()
		.forEach(System.out::println);//imprime en un orden indeterminado*/
		
		//vamos a mostrar los positivos
		st
		.parallel()
		.filter(n->n>0)
		.sequential()//convierte el paralelo en secuencial y muestra los números en el orden en el que estaban definidos
		.forEach(System.out::println);//imprime en un orden indeterminado
	}

}

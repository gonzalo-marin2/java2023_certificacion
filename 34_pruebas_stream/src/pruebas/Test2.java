package pruebas;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		/*List<Integer> lst=List.of(8,1,-2,6,5,11,9,-3,5,8);
		//Media de los positivos
		System.out.println(lst.stream()//Stream<Integer>
		.filter(n->n>=0)//Stream<Integer>positivos
		.mapToInt(n->n)//IntStream
		.average()//OptionalDouble
		.getAsDouble());//double
		
		//Mostrar pares ordenados de mayor a menor
		
		lst.stream()//Stream<Integer>
		.filter(n->n%2==0)//Stream<Integer>pares
		.sorted((a,b)->b,a)
		.forEach(System.out::println);
				
		//Número más alto
		System.out.println(lst.stream()
		.max((a,b)->a>b)
		.get());*/
		
		List<Integer> lst=List.of(8,1,-2,6,5,11,9,-3,5,8);
		//Media de los positivos
		System.out.println(lst.stream()
			.filter(n->n>=0)
			.mapToInt(n->n) //IntStream
			.average() //OptionalDouble
			.getAsDouble());//double
		
		//Mostrar pares ordenados de mayor a menor
		lst.stream()
		.filter(n->n%2==0)
		.sorted((a,b)->b-a)
		.forEach(System.out::println);
		
		//Número más alto
		System.out.println(lst.stream()
		.max((a,b)->a-b)
		.get());

	}

}

package pruebas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		int[][] nums= {{3,-4,5,7,-1},{8,5,-1,2},{1,8}};
		//mostrar la suma de todos los positivos sin incluir duplicados
		
		/*System.out.println(Arrays.stream(nums) //Stream<Integer[]>
				.flatMap(a->Arrays.stream(a))//Stream<Integer>
				.parallel()
				.distinct()
				.filter(n->n>0)
				.collect(Collectors.summingInt(n->n)));*/

	}

}

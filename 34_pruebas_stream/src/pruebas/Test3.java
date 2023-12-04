package pruebas;

import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> lst=List.of(8,1,-2,6,5,11,9,-3,5,8);
		
		lst.stream()
		.peek(System.out::println)
		.anyMatch(n->n<0);
		//anyMatch cortocircuita, en cuanto encuentra un número que cumple la condición, sale

	}

}

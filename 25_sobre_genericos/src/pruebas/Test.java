package pruebas;

import java.util.List;

public class Test {
	//public void print(List<?> lista, Integer num)
	//no es posible hacer algo en la lista con algo genérico,solo te deja hacer cosas que harías con cualquier objeto 
	//extends Number tampoco valdría
	public void print(List<? super Number> lista, Integer num) {
		lista.add(num);
	//con super llamamos a la super clase de Number o de Integer (valdrían las dos), pq no podríamos meter Integer 

	}

}

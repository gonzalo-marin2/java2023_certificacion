package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestListas {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>(List.of(2,5,7,1,7));
		System.out.println(lst.remove(2));
		//elimina la posición 2.Como el método está sobrecargado, esta versión devuelve un int y no un boolean
		System.out.println(lst.get(0));//sigue estando el 2

	}

}

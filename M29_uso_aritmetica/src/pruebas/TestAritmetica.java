package pruebas;

import service.Operaciones;

public class TestAritmetica {

	public static void main(String[] args) {
		Operaciones oper=new Operaciones(3,9);
		System.out.println(oper.restar());
	}

}

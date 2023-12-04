package pruebas;

public class Test {

	public static void main(String[] args) {
		//encapsular Integer
		Capsula<Integer> c1=new Capsula<Integer>(50);
		System.out.println("¿es null?"+c1.isNull());
		
		//encapsular String
		Capsula<String> c2=new Capsula<String>("");
		System.out.println("¿es null?"+c2.isNull());

	}

}

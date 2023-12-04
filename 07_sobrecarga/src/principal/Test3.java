package principal;

class A{
	
}

interface I{
	
}

class B extends A implements I{
	
}

public class Test3 {

	public static void main(String[] args) {
		B b=new B();
		print(b);
	}
	
	private static void print(A a) {//2 tiene la misma prioridad que la interfaz, podría dar error de compilación
		System.out.println("A");
	}
	
	private static void print(I a) {//2 tiene la misma prioridad que la clase, podría dar error de compilación
		System.out.println("I");
	}
	
	private static void print(B a) {//1
		System.out.println("B");
	}
}

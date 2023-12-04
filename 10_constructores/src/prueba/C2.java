package prueba;

public class C2 extends C1 {
	
	/*public C2(int b) {
		System.out.println("C2");
	}*/
	
	//SOLUCIÓN CORRECTA
	public C2(int a) {
		super(a);
		System.out.println("C2");
	}

	C2 c=new C2(4);

}

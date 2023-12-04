package pruebas;

public class Test {

	public static void main(String[] args) {
		Pila<Integer> pila=new Pila<>();
		//Pila<Number> pila=new Pila<>(); tb valdría de Number
		pila.agregar(10);
		pila.agregar(6);
		System.out.println(pila.sacar());
		Pila<String> pila2=new Pila<>();
		pila2.agregar("h");
		pila2.agregar("S");
		mostrar(pila);
		//mostrar(pila2);
		
		
		//no es posible:
		//Pila<Number> p=new Pila<Integer>();
		
			
		}
	//mostrar tamaño pila
			//static void mostrar(Pila<?> p) {//la interrogación, carácter comodín, que significa que vale para cualquier objeto de tipo Pila
			//sea cual sea su tipo
	static void mostrar(Pila<? extends Number> p) {//vale cualquier objeto que herede de Number
				System.out.println(p.total());
	}

}

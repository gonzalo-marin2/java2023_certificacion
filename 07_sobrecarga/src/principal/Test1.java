package principal;

public class Test1 {

	public static void main(String[] args) {
		int n=100;
		print(n);
	}
	
	private static void print(long a) {
		System.out.println("Es long");//usa este método por promoción de tipos
	}
	
	private static void print(int... a) {
		System.out.println("Es varargs");
	}
	
	private static void print(Integer a) {
		System.out.println("Es Integer");//si comentamos el primero, llama a este por el autoboxing
	}
	
	private static void print(Long a) {
		System.out.println("Es Integer");//tendría que hacer una promoción a long primitivo y luego autoboxing, por lo que 
		//da error ya que solo puede hacer una operación
	}
	
	private static void print(long... a) {//en este caso hace una promoción de tipos
		System.out.println("Es varargs");
	}

}

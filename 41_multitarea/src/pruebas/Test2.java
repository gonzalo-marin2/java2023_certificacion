package pruebas;

public class Test2 {

	public static void main(String[] args) {
		//pregunta 10 de las preguntas de examen
		
		Runnable r1=()->System.out.print("hello,");
		Runnable r2=()->System.out.print("by,");
		Thread t1=new Thread(r1);
		t1.start();
		t1=new Thread(r2);
		t1.start();
		System.out.println("tomorrow,");
		t1.start();

	}

}

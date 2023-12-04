package pruebas;

public class TestStringBuilder {

	public static void main(String[] args) {
		/*StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("by");
		//StringBuilder sb3=sb1+sb2;==>error de compilación
		StringBuilder s3=new StringBuilder(sb1+" "+sb2);//esto sí que está permitido*/
		
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("hello");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println(sb1.compareTo(sb2)==0);//sale true devuelve 0 si son iguales
		
		StringBuilder a=new StringBuilder("hello by");
		String b="hello";
		System.out.println(b.equals(a.delete(5, 8)));//dará false. equals() dará true si no es null y si es un objeto String
		System.out.println(b.equals(a.delete(5, 8).toString()));//true, pq ahora sí son dos objetos String
		
		StringBuilder w=new StringBuilder(50);//reserva memoria para 50 caracteres
		System.out.println(w.length());//dará cero, está vacío
	}

}

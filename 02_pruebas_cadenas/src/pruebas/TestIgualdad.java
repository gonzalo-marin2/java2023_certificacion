package pruebas;

public class TestIgualdad {

	public static void main(String[] args) {
		/*String a="hello";
		String b="hello";
		String c=new String("by");
		String d=new String("by");
		
		System.out.println(a==b);
		System.out.println(c==d);
		*/
		//Dará true pq apuntan al mismo objeto y false pq apuntan a otro objeto
		
		
		//String a=new String("cadena");
		/*String a="cadena";
		String b=a.toLowerCase();
		String c=a.trim();
		StringBuilder sb=new StringBuilder(a);
		String d=a;
		System.out.println(a==b);//true
		System.out.println(a==c);//true
		System.out.println(a==d);//true
		System.out.println(a==sb.toString());//false*/
		
		//si hubieran llegado de sitios diferentes, hubiera dado false
		/*String x="cadena";
		 *String b=x.toLowerCase();
		 *System.out.println(a==b);//false
		 * */
		
		/*String a="cadena";
		String b="CADENA";
		System.out.println(a==b.toLowerCase());//false, apuntan a otro objeto*/
		
		//==no compara el texto, equals()sí que lo hace
		
		
		String s="";
		StringBuilder a=new StringBuilder("alt ");
		String p=a.delete(0,3).toString().trim();
		System.out.println(a);
		System.out.println(p);
		System.out.println(p.isBlank());
		System.out.println(p.isBlank()?s==p.trim():s==p);
		System.out.println(s.hashCode());//devuelve cero en este caso
		System.out.println(p.hashCode());//devuelve cero en este caso
		
		

	}

}

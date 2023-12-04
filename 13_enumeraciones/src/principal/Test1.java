package principal;

public class Test1 {

	public static void main(String[] args) {
		enum Dias{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES;}
		Dias d=Dias.JUEVES;
		String result=switch(d){
			case LUNES,MARTES,MIERCOLES->"pronto";
			case JUEVES->"correcto";
			case VIERNES->"tarde";
			//default->"";//no es necesario, todos los valores están cubiertos
		};
		
		System.out.println(result);
	}

}

package principal;
record Persona(String nombre, int edad) {//constructor implícito o canónico
	//no puedo añadir una variable adicionales
	//String email;
	//Sí variables de instancia(static):
	static int s=10;
	//constructor compacto, no podemos usar el this en él
	Persona{
		if(edad<18) {
			edad=18;
		}
	}
	
	//Constructor adicional
	Persona(){
		/*this.nombre="h";
		this.edad=30;*/
		this("h",30);//se dan los valores mediante llamada al canónico
	}
	
	
	public void print() {
		s++;
		System.out.println(this.nombre);
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		var r=new Persona("pepe",22);
		r.print();

	}

}

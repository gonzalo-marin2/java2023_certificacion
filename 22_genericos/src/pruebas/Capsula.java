package pruebas;
/*
 Crear una clase que permita encapsular cualquier tipo de objeto Java.
-Tendrá un constructor que permita inicializar el objeto de la clase con el dato
a encapsular
-Tendrá métodos setter y getter
-Tendrá un método isNull() que devolverá null si el objeto encapsulado es nulo 
 */


//solo podemos operar con los métodos de Object 
public class Capsula<X> {
	X dato;
	public Capsula(X dato) {
		this.dato=dato;
	}
	public X getDato() {
		return dato;
	}
	public void setDato(X dato) {
		this.dato=dato;
	}
	public boolean isNull() {
		return dato==null;//devuelve dato si es null
	}
}

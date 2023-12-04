package geometria;
/*Hacer 2 clases de figura: triángulo y círculo
 * Atributos de triángulo: base y altura
 * Atributos de círculo: radio*/

/*Definir Figura de modo que solo pueda ser heredada por Circulo 
y Triangulo. Estas clases a su vez podrán ser heredadas 
por cualquiera */

public abstract sealed class Figura permits Circulo, Triangulo {
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double superficie();
}

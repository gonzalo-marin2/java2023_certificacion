package model;

import java.io.Serializable;

class Empleado{
	private String codigo;
	public Empleado(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	public Empleado() {};

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}

public class Persona extends Empleado implements Serializable {
	private String nombre;
	private String dni;
	private transient int edad;
	public Persona() {};
	//al haber atributos no serializados, llama al constructor sin parámetros en la deserialización
	//tanto al de la clase como al de la super clase
	//al deserializar, llama al default constructor que tiene que estar en ambas clases
	//esto sucede por heredar de una clase no serializable
	//crea un objeto vacío y le va relllenando con datos
	public Persona(String nombre, String dni, int edad, String codigo) {
		super(codigo);
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}

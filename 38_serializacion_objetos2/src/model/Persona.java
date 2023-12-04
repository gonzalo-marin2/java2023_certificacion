package model;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private String dni;
	private transient int edad;
	private Empleado emp;//la persona no hereda Empleado, contiene un objeto de tipo Empleado
	//funcionaría poniendo tb transient
	public Persona() {};
	//al haber atributos no serializados, llama al constructor sin parámetros en la deserialización
	//tanto al de la clase como al de la super clase
	//al deserializar, llama al default constructor que tiene que estar en ambas clases
	//esto sucede por heredar de una clase no serializable
	//crea un objeto vacío y le va rellenando con datos
	
	public String getNombre() {
		return nombre;
	}
	public Persona(String nombre, String dni, int edad, Empleado emp) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.emp = emp;
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
	public Empleado getEmp() {
		return emp;
	}
	public void setEmp(Empleado emp) {
		this.emp = emp;
	}
	
	
}

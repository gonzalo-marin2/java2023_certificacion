package principal;

import java.io.Serializable;

public class Test2 {

	public static void main(String[] args) {
		Integer integ=20;
		print(integ);

	}
	
	private static void print(Object ob) {//4=>Promoción a súperclase superior 
		System.out.println("Object");
	}
	
	private static void print(Serializable ob) {//3=>Interfaz implementada
		System.out.println("Serializable");
	}
	
	private static void print(Number ob) {//2=>Promoción a súperclase directa. Es Number quien implementa Serializable, no Integer
		System.out.println("Number");
	}
	//OJO==>Comparar con Test3
	
	private static void print(Integer ob) {//1=>Coincidencia exacta
		System.out.println("Integer");
	}
	
	private static void print(Integer  ...ob) {//5=>Último que se prueba
		System.out.println("varargs");
	}

}

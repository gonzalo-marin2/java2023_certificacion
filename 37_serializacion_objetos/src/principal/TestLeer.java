package principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Persona;

public class TestLeer {

	public static void main(String[] args) {
		String ruta="c:\\temp\\person.obj";
		try(FileInputStream fis=new FileInputStream(ruta);
				ObjectInputStream in=new ObjectInputStream(fis)){
			Persona persona=(Persona)in.readObject();//hacemos un casting, sino da error pq devuelve un objeto genérico
			System.out.println("Nombre: "+persona.getNombre());
			System.out.println("DNI: "+persona.getDni());
			System.out.println("Edad: "+persona.getEdad());
			System.out.println("Código: "+persona.getCodigo());
		}
		catch(IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}

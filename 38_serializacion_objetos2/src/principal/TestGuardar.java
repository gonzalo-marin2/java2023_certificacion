package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Empleado;
import model.Persona;

public class TestGuardar {

	public static void main(String[] args) {
		String ruta="c:\\temp\\person.obj";
		Persona persona=new Persona("persona1", "22222w", 30, new Empleado("A200"));
		
		//guarda un único objeto, si le das varias veces, pisa lo anterior
		
		try(FileOutputStream fos=new FileOutputStream(ruta);
				ObjectOutputStream out=new ObjectOutputStream(fos)){
			//guardamos objeto persona
			out.writeObject(persona);
			System.out.println("Persona guardada");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}

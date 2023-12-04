package pruebas;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test2 {

	public static void main(String[] args) {
		ResourceBundle rb=ResourceBundle.getBundle("textos", Locale.ENGLISH);
		//ResourceBundle rb=ResourceBundle.getBundle("textos", Locale.JAPAN);//saldrá el que tenga por defecto ya que no existe en japonés
		//se puede cambiar la localización por defecto
		Locale.setDefault(Locale.ENGLISH);//hemos puesto por defecto la inglesa
		
		System.out.println(rb.getString("t1"));
		System.out.println(rb.getString("t2"));

	}

}

package pruebas;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Test1 {

	public static void main(String[] args) {
		double salario=2345.45;
		//Locale ld=new Locale("es", "ES"); en España
		Locale ld=Locale.JAPAN;
		NumberFormat nf=NumberFormat.getCurrencyInstance(ld);
		System.out.println(nf.format(salario));
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, ld);
		System.out.println(df.format(new Date()));

	}

}

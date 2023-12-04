package pruebas;

public class Test2 {

	public static void main(String[] args) {
		
		
			
				final String str1="hello ";
				final String str2="""
						hello
						""";
				final String str3="""
						hello""";
				final String str4="hello by";
				
				switch(args[0]) {//evalúa el primer argumento
					case str1:
						System.out.print(0);
					case str2:
						System.out.print(1);
					case str3:
						System.out.print(2);
					case str4:
						System.out.print(3);
					default:
						System.out.print(4);
				}
			}

		

		//And the execution command:
		//>java Test hello by//se pasan 2 argumentos por la línea de comandos
		//Which is the result?

		/*a)	234 ==>Correcta
		b)	1234
		c)	01234
		d)	4
		e)	34
		f)	compilations fails*/
		
		
		
		
	}



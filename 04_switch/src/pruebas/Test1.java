package pruebas;

public class Test1 {
	
	public static void main(String[] args){
		
		/*Integer data=10;
		int n=2;
		switch(data/n){
			case 1,3->System.out.print("low ");
			case 4,5-> System.out.print("medium ");
			case 6,7,9-> System.out.print("high");
		}*/
		
		//Daría error, falta bloque default
		
		//Se podría usar así:
		
		//No daría error, es un switch clásico no necesita bloque default
		Integer data=10;
		int n=2;
		switch(data/n){
			case 1,3:
				System.out.print("low ");
			case 4,5:
				System.out.print("medium ");
			case 6,7,9:
				System.out.print("high");
		}
		
		/*Integer data=10;
		int n=2;
		switch(data/n){
			case 1,3->
				System.out.print("low ");
			case 4,5->
				System.out.print("medium ");
			case 6,7,9->
				System.out.print("high");
		}*/
		
		
	}

}

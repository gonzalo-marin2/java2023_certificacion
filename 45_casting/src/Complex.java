
public class Complex {
	
			
			class Building {}
			final class House extends Building {}
			public void convert() {
			Building b1 = new Building();
			House h1 = new House();
			Building b2 = new House();
			Building b3 = (House) b1;//da excepción, no error de compilación=>ClassCastException
			//House h2 = (Building) h1;//error de compilación pq no podemos asignar un building a un house
			Building b4 = (Building) b2;
			House h3 = (House) b2;
				} 
			

			

}

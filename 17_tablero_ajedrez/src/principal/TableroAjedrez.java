package principal;

public class TableroAjedrez {

	public static void main(String[] args) {
		
		//DECLARAMOS ARRAY
		String[][] tablero=new String[8][8];
		//RELLENAMOS EL TABLERO
		for(int i=0;i<tablero.length;i++) {
			for(int k=0;k<8;k++) {
				tablero[i][k]=(i+k)%2==0?"B":"N";
			}
		}
		//MOSTRAMOS EL TABLERO
		for(String[] s:tablero) {
			for(String c:s) {
				System.out.print(c+" ");//no cambio de línea
			}
			System.out.println();//Cambiamos de línea cada vez que termina una vuelta de s
		}
		
		

	}

}

package principal;
class Externa3{
	static int n=2;
	int p=10;
	public void pr() {
		int w=1;
		class Interna{//en teoría puede acceder a cualquier variable. A las locales del método puede acceder si se tratan como finales
			int s=1;
			public void print() {
				System.out.println(s+"-"+n+"-"+p+"-"+w);
			}
		}
		//objetos de Interna solo dentro del método
		Interna in=new Interna();
		in.print();
	}
}
public class TestInternaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

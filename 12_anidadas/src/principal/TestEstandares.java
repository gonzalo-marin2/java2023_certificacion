package principal;
class Externa2{
	static int n=5;
	int p=1;
	class Interna{
		public void print() {
			System.out.println(n+"-"+p);
		}
	}
}
public class TestEstandares {

	public static void main(String[] args) {
		//Externa.Interna in=new Externa.Interna(); ERROR
		//Necesitamos un objeto de la externa
		Externa2.Interna in=(new Externa2()).new Interna();
		in.print();
		//Externa ext=new Externa();
		//Externa.Interna inter=ext.new Interna(); 
		

	}

}

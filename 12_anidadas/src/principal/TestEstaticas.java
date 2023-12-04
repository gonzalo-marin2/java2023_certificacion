package principal;
class Externa{
	//private static class Interna{	
	//}
	static int k=10;
	int s;//al no ser estático no podemos acceder a ella desde Interna
	static class Interna{
		public void print() {
			System.out.println(k);
			//s++; da error pq no podemos acceder a algo que no sea estático
		}
	}
}
public class TestEstaticas {

	public static void main(String[] args) {
		Externa.Interna in=new Externa.Interna();//no es visible si Interna es private
		in.print();

	}

}

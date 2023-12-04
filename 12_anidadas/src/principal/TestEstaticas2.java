package principal;
class A{
	private static int c=2;
	static void m(){
		System.out.print(c);//1
	}
	static class B{
		void print(){
		c++;//2
		m();//3
		}
	}
}
public class TestEstaticas2 {

	public static void main(String[] args) {
		A.B obj=new A.B();
		obj.print();//4

	}

}

package pruebas;

class C1{
	int x;
	public C1(){
		x++;
	}
	String print() {
		return "hello";
	}
}
class C2 extends C1{
	int x;
	int y=10;
	public C2(){
		x++;
		//para acceder a la del padre:
		super.x++;//valdría 2
	}
	String print() {
		return "by";
	}
}


public class Test {
	


	

	public static void main(String[] args) {
		C1 c=new C2();
		System.out.println(c.x);//2, vemos la del padre
		System.out.println(c.print());//by, sobreescritura del método
		//System.out.println(c.y);//no se podría pq no está en C1. Para poder verla, habría que hacer un casting
		System.out.println(((C2)c).y);
	}

}

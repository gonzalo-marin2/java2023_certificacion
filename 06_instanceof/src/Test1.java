
class C1{};
	interface I1{};
	class C2 extends C1 implements I1{};
	interface I2{};
	class C3{};
	//no daría error de compilación si:
	//class C3 extends C2{}

public class Test1 {

	
	public static void main(String[] args) {
		C1 c=new C2();
		System.out.println(c instanceof C2);
		System.out.println(c instanceof I1);
		System.out.println(c instanceof I2);//no hay herencia, pero con las interfaces no hay error de compilación, da false
		//System.out.println(c instanceof C3); error, no hay declaración de herencia
		//si c3 hereda c2, la pregunta anterior daría false 
		
		
		Number n=2.3;
		System.out.println(n instanceof Integer);
		

	}

}

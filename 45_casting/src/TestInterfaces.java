interface M1{};
interface M2{};
class A implements M1, M2{}

public class TestInterfaces {
	M1 m1=new A();
	M2 m2=(M2)m1;
	//dará classCastException, pero no error de compilación
	

}

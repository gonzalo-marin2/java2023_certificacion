package p2;

import p1.C1;

public class C2 extends C1 {
	
	public C2(){
		super();
	}

	public static void main(String[] args) {
		
		//C1 c=new C1();error, el constructor no es público
		C1 c=new C2();//no da error pq está instanciando un objeto C2
	}

}

package pruebas;

import java.util.Arrays;

public class CompareMismatch {

	public static void main(String[] args) {
		char[] a={'h','e','l','l'};
		char[] b={};
		
		int[] a1={1,2,3,4};
		int[] b2={1,2,3};
		
		int x=Arrays.compare(a,b);
		int y=Arrays.mismatch(a,b);
		System.out.println(x+"-"+y);
		System.out.println(Arrays.compare(a1,b2));
		
		char[] c1={'w','e','r','t'};
		char[] c2={'a'};
		System.out.println(Arrays.compare(c1,c2));

	}

}

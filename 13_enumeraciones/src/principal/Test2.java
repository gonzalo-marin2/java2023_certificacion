package principal;
enum Direction implements Runnable{//no puede heredar clases
	X(10),Y(20), Z(30);
	int inc;
	Direction(int inc) {
		this.inc=inc;
	}
	public void change(int s) {
		inc+=s;
	}
	@Override
	public void run() {
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		var ob=Direction.X;
		ob.change(10);
		System.out.println(ob.inc);

	}

}

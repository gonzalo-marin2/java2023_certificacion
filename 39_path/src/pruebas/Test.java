package pruebas;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		Path p1=Path.of("c:\\temp\\mydata.txt");
		Path p2=Paths.get("c:\\temp\\..\\data.txt");
		System.out.println(p1.relativize(p2));

	}

}

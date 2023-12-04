package pruebas;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		/*var map=Map.ofEntries(Map.entry(100, "a"));
		Map.entry(200, "b");
		Map.entry(100, "c");
	System.out.println(map.get(100));//sale a */
		
		var map=new HashMap<Integer,String>(Map.ofEntries(Map.entry(100, "a"),
		Map.entry(200, "b")));
		map.put(100, "c");
		map.put(null,"x");
		map.put(null, "y");
		System.out.println(map.get(null));
		
	}

}

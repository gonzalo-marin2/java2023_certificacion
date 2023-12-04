package pruebas;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {
	//pregunta9
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Integer[] numbers= {4,1,7,11,2};

		ExecutorService executor=Executors.newCachedThreadPool();
		var f1=executor.submit(()->Arrays.stream(numbers)
				.filter(n->n%2==0).
				mapToInt(n->n)
				.sum());
		var f2=executor.submit(()->Arrays.stream(numbers)
				.filter(n->n%2!=0)
				.mapToInt(n->n)
				.sum());

		System.out.println(f1.get());
		System.out.println(f2.get());
		executor.shutdown();
	}

}

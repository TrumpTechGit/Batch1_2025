package in.trump.stream;

import java.util.stream.Stream;

public class ParallelStreamsDemo {

	public static void main(String[] args) {
		System.out.println("serial stream");
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		stream1.forEach(num -> System.out.println(num +" :"+Thread.currentThread().getName()));
		
		System.out.println("parallel stream-------------------");
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		stream2.parallel().forEach(num -> System.out.println(num +" :"+Thread.currentThread().getName()));

	}

}

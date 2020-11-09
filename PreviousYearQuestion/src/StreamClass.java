import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StreamClass {

	public static void main(String[] args) throws IOException {
		// IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));
		// System.out.println(IntStream.range(1, 10).sum());
		// Stream.of("Arav", "Arnab",
		// "Suparna").sorted().findFirst().ifPresent(System.out::println);
//		String[] names = { "Arav", "Arnab", "Suparna" };
//		Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);
		// Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x *
		// x).average().ifPresent(System.out::println);
		List<String> list = Arrays.asList("Arav", "Arnab", "Suparna");
		list.stream().map(String::toLowerCase).filter(x -> x.startsWith("s")).forEach(System.out::println);

	}

}

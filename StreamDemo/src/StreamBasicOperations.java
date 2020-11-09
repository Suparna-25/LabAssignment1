import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;

public class StreamBasicOperations {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("1", "2", "3", "4", " ");
		// int streamFilter=string.stream().filter(str->str.isEmpty()).count();
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
	}

}

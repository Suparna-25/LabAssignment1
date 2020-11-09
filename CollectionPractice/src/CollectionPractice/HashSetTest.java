package CollectionPractice;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = null;

		Set<HashSetConstruct> set = new TreeSet<HashSetConstruct>();

		System.out.println("Enter the size of the set");
		int size = sc.nextInt();
		System.out.println("Enter the set of Names");

		for (int i = 0; i < size; i++) {
			name = sc.next();
			set.add(new HashSetConstruct(name));
		}
		System.out.println("Given set is" + set);
		sc.close();
	}

}

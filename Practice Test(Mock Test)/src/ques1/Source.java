import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));

		return list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			a.add(list.get(i));
		}
		return a;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {

		Collections.replaceAll(list, m, n);
		return list;
	}
}

public class Source {
	public static void main(String[] args) {
		ArrayListOps al = new ArrayListOps();
		int n = 4;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1 = al.makeArrayListInt(n);
		System.out.println(list1);
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		list1 = al.reverseList(list);
		System.out.println(list1);
		int m = 28;
		n = 20;
		list1 = al.changeList(list, m, n);
		System.out.println(list1);

	}
}
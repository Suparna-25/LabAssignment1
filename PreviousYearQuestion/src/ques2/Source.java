package ques2;

import java.util.HashSet;
import java.util.Set;

public class Source {
	public static Set<Integer> subtract(Set<Integer> a, Set<Integer> b) {
		Set<Integer> c = new HashSet<Integer>(a);
		c.removeAll(b);
		return c;
	}

	public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
		Set<Integer> c = new HashSet<Integer>(a);
		c.addAll(b);
		return c;
	}

	public static Set<Integer> intersect(Set<Integer> a, Set<Integer> b) {
		Set<Integer> c = new HashSet<Integer>(a);
		c.retainAll(b);
		return c;
	}

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		Set<Integer> b = new HashSet<>();
		b.add(9);
		b.add(3);
		b.add(7);
		System.out.println("Subtract= " + subtract(a, b));
		System.out.println("union= " + union(a, b));
		System.out.println("intersect= " + intersect(a, b));
	}

}

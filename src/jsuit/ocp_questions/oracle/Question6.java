package jsuit.ocp_questions.oracle;

import java.util.ArrayDeque;
import java.util.Queue;

public class Question6 {

	public static void main(String[] args) {
		Queue<String> products = new ArrayDeque<>();
		products.add("p1");
		products.add("p2");
		products.add("p3");
		System.out.print(products.peek());
		System.out.print(products.poll());
		System.out.println("");

		while (products.peek() != null) {
			System.out.print(products.poll());
		}
		// products.forEach(s -> System.out.print(s)); // alternative to while loop above
	}
}

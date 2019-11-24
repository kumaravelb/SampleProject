package com.java.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExa {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("java");
		l.add("kumar");
		l.add("kesaven");
		l.add("vij");
		l.add("kilkatha");
		l.add("j2ee");
		System.out.println(l);
		System.out.println("collection" + l.size());
		Collections.swap(l, 1, 4);
		System.out.println(l);

		// l.removeAll(l);
		l.clear();
		l.forEach(s -> {
			System.out.println(s);
		});

		ListIterator<String> li = l.listIterator();
		while (li.hasPrevious()) {
			String string = (String) li.previous();
			System.out.println(string);

		}

		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println("clear collection");
			System.out.println(s);

		}

		List<String> ll = new ArrayList<>();
		ll.add("kumaravel");
		ll.add("kumar");
		ll.add("kesaven");
		ll.add("vij");
		ll.add("kilkatha");

		boolean d = Collections.disjoint(l, ll);
		System.out.println(d);

	}

}

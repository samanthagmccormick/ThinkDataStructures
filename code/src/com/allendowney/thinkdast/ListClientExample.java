package com.allendowney.thinkdast;

import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	private final List list;

	public ListClientExample() {
		// This is the only place where a List implementation is specifically used.
		// Because of that, that makes it easy to go and change LinkedList() here to ArrayList() later on, or
		// any other type of List implementation.
		this.list = new ArrayList();
	}

	public List getList() {
		return this.list;
	}

	public static void main(final String[] args) {
		final ListClientExample lce = new ListClientExample();
		final List list = lce.getList();
		System.out.println(list);
		System.out.print("stuff");
	}
}

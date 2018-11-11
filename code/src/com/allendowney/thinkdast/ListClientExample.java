package com.allendowney.thinkdast;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
	private final List list;

	public ListClientExample() {
		this.list = new LinkedList();
	}

	public List getList() {
		return this.list;
	}

	public static void main(final String[] args) {
		final ListClientExample lce = new ListClientExample();
		final List list = lce.getList();
		System.out.println(list);
		System.out.print("SOMWETHINGGGGGG");
	}
}

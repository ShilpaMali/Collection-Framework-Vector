package com.velocity.vector;

import java.util.Iterator;
import java.util.Vector;

//Program for vector method
public class Vector3 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(); // create vector with 10 capacity
		v.add("pune");
		v.add("mumbai");
		v.add("bangalore");
		// using iterator
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

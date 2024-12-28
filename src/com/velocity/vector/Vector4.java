package com.velocity.vector;

import java.util.Vector;

//Program for vector method
public class Vector4 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(); // create vector with 10 capacity
		v.add("pune");
		v.add("mumbai");
		v.add("bangalore");
		// using for each loop
		for (String s : v) {
			System.out.println(s);
		}
	}
}

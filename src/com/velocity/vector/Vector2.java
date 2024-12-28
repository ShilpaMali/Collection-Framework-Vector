package com.velocity.vector;

import java.util.Vector;

//Program for vector method
public class Vector2 {

	public static void main(String[] args) {

		Vector v = new Vector(); // create vector with 10 capacity
		v.add("pune");
		v.add("mumbai");
		v.add("bangalore");
		while (v.contains("pune")) {
			v.remove("pune");
		}
		System.out.println(v);
	}
}

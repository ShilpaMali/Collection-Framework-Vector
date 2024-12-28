package com.velocity.vector;

import java.util.Vector;

public class Vector5 {

	// Design method which return object to that method
	public Vector getVector() {
		Vector v1 = new Vector();
		v1.add("red");
		v1.add("blue");
		v1.add("green");
		return v1;
	}

	public static void main(String[] args) {
		Vector5 vector = new Vector5();
		Vector v2 = vector.getVector();
		System.out.println(v2);
	}
}

package com.velocity.vector;

import java.util.Vector;

public class Vector6 {

	// Design method which return object to that method
	public Vector<String> getVector() {
		Vector<String> v1 = new Vector<String>();
		v1.add("red");
		v1.add("blue");
		v1.add("green");
		return v1;
	}

	public static void main(String[] args) {
		Vector6 vector5 = new Vector6();
		Vector<String> v2 = vector5.getVector();
		System.out.println(v2);
	}
}

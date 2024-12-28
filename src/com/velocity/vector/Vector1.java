package com.velocity.vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector v = new Vector(); //create vector with 10 capacity
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(20); //duplicate added
		v.add(null); //null insertion is possible
		v.add("pune"); //heterogenous object
		//1st way
		System.out.println(v);
	}
}

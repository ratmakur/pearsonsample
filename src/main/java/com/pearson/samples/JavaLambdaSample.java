package com.pearson.samples;

import java.util.ArrayList;

public class JavaLambdaSample {
	
	/*
	 * Expressions are limited. They have to immediately return a value, and they cannot contain variables, 
	 * assignments or statements such as if or for. In order to do more complex operations, 
	 * a code block can be used with curly braces. 
	 */
	
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(25);
	    numbers.add(92);
	    numbers.add(45);
	    numbers.add(22);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	  }
}

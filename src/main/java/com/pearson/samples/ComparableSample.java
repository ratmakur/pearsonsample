package com.pearson.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample {
	public static void main(String[] args) {
	    List<Employee> team = new ArrayList<Employee>();
	    Employee emp1 = new Employee("Roger", 20);
	    Employee emp2 = new Employee("John", 27);
	    Employee emp3 = new Employee("Steven", 24);
	    
	    team.add(emp1);
	    team.add(emp2);
	    team.add(emp3);

	    System.out.println("Before Sorting : " + team);
	    //sort by age
	    Collections.sort(team);
	    System.out.println("After Sorting : " + team);
	}
}

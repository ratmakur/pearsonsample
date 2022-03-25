package com.pearson.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorSample {
	
	public static void main(String[] args) {
	    List<Employee> team = new ArrayList<Employee>();
	    Employee emp1 = new Employee("John", 20);
	    Employee emp2 = new Employee("Roger", 22);
	    Employee emp3 = new Employee("Adam", 24);
	    team.add(emp1);
	    team.add(emp2);
	    team.add(emp3);

	    System.out.println("Before Sorting : " + team);	    
	    EmployeeNameComparator NameComparator = new EmployeeNameComparator();
	    Collections.sort(team, NameComparator);
	    System.out.println("After Sorting : " + team);
	}
}

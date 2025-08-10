package com.wipro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wipro.collections.Employee;

public class SortTest {

	public static void main(String[] args) {
		Employee e1=new Employee("emp01", "Chaitu", 34, 558792);
		Employee e2=new Employee("emp02", "Amani", 32, 89778);
		Employee e3=new Employee("emp03", "siri", 26, 8478922);
		Employee e4=new Employee("emp04", "mani", 38, 55122);
		
		List<Employee> e=new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		
		Collections.sort(e);;
		for(Employee employee : e)
		{
			System.out.println(employee);
		}
	}

}

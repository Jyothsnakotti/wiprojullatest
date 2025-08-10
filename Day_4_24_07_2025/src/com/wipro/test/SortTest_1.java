package com.wipro.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wipro.collections.Employee;
import com.wipro.collections.SortByEmpAge;
import com.wipro.collections.SortByEmpId;
import com.wipro.collections.SortByEmpName;

public class SortTest_1 {
	 public static void main(String[] args) {
	 Employee e1 = new Employee("emp03", "Siri", 26, 8478922);
     Employee e2 = new Employee("emp01", "Chaitu", 34, 558792);
     Employee e3 = new Employee("emp04", "Mani", 38, 55122);
     Employee e4 = new Employee("emp02", "Amani", 32, 89778);

     List<Employee> empList = new ArrayList<>();
     empList.add(e1);
     empList.add(e2);
     empList.add(e3);
     empList.add(e4);

     System.out.println("Original List:");
     empList.forEach(System.out::println);

     Collections.sort(empList, new SortByEmpId());
     System.out.println("\nSorted by empId:");
     empList.forEach(System.out::println);

     Collections.sort(empList, new SortByEmpName());
     System.out.println("\nSorted by empName:");
     empList.forEach(System.out::println);

     Collections.sort(empList, new SortByEmpAge());
     System.out.println("\nSorted by empAge:");
     empList.forEach(System.out::println);

}
}

package com.wipro.collections;

import java.util.Comparator;

public class SortByEmpId implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getEmpId().compareTo(e2.getEmpId());
    } 

}

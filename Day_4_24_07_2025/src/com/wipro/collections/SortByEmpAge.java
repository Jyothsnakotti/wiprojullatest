package com.wipro.collections;

import java.util.Comparator;

public class SortByEmpAge implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getEmpAge(), e2.getEmpAge());}

}

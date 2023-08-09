package com.workintech.maps.employees;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        Employee e1 = new Employee("Ilgın", "Ökdem", 1);
        Employee e2 = new Employee("Segah", "Durak", 1);
        Employee e3 = new Employee("Elif", "Durak", 2);
        Employee e4 = new Employee("Tolga", "Kangal", 3);
        Employee e5 = new Employee("Armağan", "Erzik", 4);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println(employees);
        System.out.println(employeeMap);

    }
}










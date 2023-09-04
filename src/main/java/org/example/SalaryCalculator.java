package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryCalculator {
    public Double calculateSalary(Employee employee) {
        Double salary = employee.getSalary();
        Double tax = calculateTax(employee);
        Double netSalary = salary - (salary * tax);
        return netSalary;
    }


    public Map<String, Double> calculateSalary(List<Employee> employees) {
        Map<String, Double> salaryMap = new HashMap<>();

        for (Employee employee : employees) {
            Double salary = employee.getSalary();
            Double tax = calculateTax(employee);
            Double netSalary = salary - (salary * tax);

            salaryMap.put(employee.getNationalId(), netSalary);
        }

        return salaryMap;

    }

    private Double calculateTax(Employee employee) {
        Double salary = employee.getSalary();
        Double taxRate;

        if (salary >= 10_000_000 && salary < 20_000_000) {
            taxRate = 0.05;
        } else if (salary >= 20_000_000 && salary < 30_000_000) {
            taxRate = 0.10;
        } else {
            taxRate = 0.15;
        }
        return taxRate;
    }


}

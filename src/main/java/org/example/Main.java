package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        Manager manager = new Manager();
        manager.setNationalId("4433464074");
        manager.setSalary(31500000d);

        Driver driver = new Driver();
        driver.setNationalId("0062346792");
        driver.setSalary(11000000d);

        Secretary secretary = new Secretary();
        secretary.setNationalId("4420081201");
        secretary.setSalary(15000000d);

        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(driver);
        employees.add(secretary);

        Map<String, Double> salaries = salaryCalculator.calculateSalary(employees);

        for (String nationalId : salaries.keySet()) {
            System.out.println(nationalId + " -> " + String.format(".%.2f", salaries.get(nationalId)));
        }
    }
}
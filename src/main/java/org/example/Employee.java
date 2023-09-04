package org.example;

public class Employee {
    private String nationalId;
    private String name;
    private Double salary;
    private Double taxRate;

    public Employee() {

    }

    public Employee(String nationalId, String name, Double salary, Double taxRate) {
        this.nationalId = nationalId;
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}

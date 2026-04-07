/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automated_testing2;

/**
 *
 * @author lab_services_student
 */
public class Employee {
    
    //Data Fields
    private double salary;
    
    //Create a constructor
    public Employee (double salary) {
        this.salary = salary;
    }
    
    //Create a calculate salary method
    public double calculateSalary (double bonus, double taxRate) {
        double grossSalary = salary + bonus;
        double tax = grossSalary * taxRate;
        return grossSalary - tax;
    }
    
}

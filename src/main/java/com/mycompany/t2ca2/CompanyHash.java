/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2ca2;

import java.util.HashSet;

/**
 * @date start    29/02/24
 * @author  Yevhen Kuropiatnyk
 * @email   evgeniy.kuropyatnik@gmail.com
 * @student sba23066
 * The same as Company class but based on HashSet
 */
public class CompanyHash {
    
    private String companyName;
    private HashSet<Employee> staffSet;
    
    
    //Write the default constructor for this class which initialises all fields.
    public CompanyHash(){ 
        companyName = "defCompanyName";
        staffSet = new HashSet<>(); 
    }
    
    //Write an overloaded constructor which accepts a name value as a parameter.
    public CompanyHash(String companyNme){ 
        companyName = companyNme;
        staffSet = new HashSet<>(); 
    }    
    
    
    //Complete the implementation by writing the code for the following methods only: 
    public void addNewStaff(Employee empl) {
        staffSet.add(empl); // Bonus challenge
    }
    
    public int getStaffNumber() {
       return staffSet.size(); // Bonus challenge
    }
    
    public void listEmployees(int employee_number ){
        for (Employee emp : staffSet) {
            if (emp.getEmpNum() > employee_number) {
                System.out.println(emp.getName());
            }
        }
    }

    // Challenges: Create a method in the Company class called removeStaff() that removes an 
    // employee from the staff array (the employee s empNum is a parameter).
    public boolean removeStaff(int empNum ) {
        boolean FoundAndRemoved = false;
        for (Employee emp : staffSet) {
            if (emp.getEmpNum() == empNum) {
                staffSet.remove(emp);
                FoundAndRemoved = true;
            }
        }
        return FoundAndRemoved;
    }
    
}

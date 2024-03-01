/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2ca2;

import java.util.ArrayList;

/**
 * @date start    19/02/24
 * @author  Yevhen Kuropiatnyk
 * @email   evgeniy.kuropyatnik@gmail.com
 * @student sba23066
 */
public class Company {
    
    private String companyName;
    private ArrayList<Employee> staff;

    
    //Write the default constructor for this class which initialises all fields.
    public Company(){ 
        companyName = "defCompanyName";
        staff = new ArrayList<>();
    }
    
    //Write an overloaded constructor which accepts a name value as a parameter.
    public Company(String companyNme){ 
        companyName = companyNme;
        staff = new ArrayList<>();
    }
    
    //Complete the implementation by writing the code for the following methods only: 
    public void addNewStaff(Employee empl) {
        staff.add(empl);
    }
    
    //Returns the number of employees currently in the arrayList
    public int getStaffNumber() {
        return staff.size();
    }
    
    //uses an iterator object to find in the arrayList all employees above 
    //a given employee number value  (this value is a parameter for this method) 
    // and prints the names of these employees. 
    public void listEmployees(int employee_number ){
        for (Employee emp : staff) {
            if (emp.getEmpNum() > employee_number) {
                System.out.println(emp.getName());
            }
        }
   
    }

    // *As there is no front-end requirement or specification OR limitation
    public void listAllEmployees(){
        int cnt = 0;
        System.out.println("--------------- LIST of EMPLOYEES --------------");
        System.out.println(" # |\t name \t\t|\t email \t\t|");
        System.out.println("------------------------------------------------"); 
        for (Employee emp : staff) {
            System.out.println(" " + emp.getEmpNum() + " |\t" + emp.getName() + "\t|\t" + emp.getEmail() + "\t|");
            cnt++;
        }
        if (cnt==0) System.out.println("|\t\t NO EMPLOYEES FOUND \t\t|");
        System.out.println("------------------------------------------------");
    }
    
    // Challenges: Create a method in the Company class called removeStaff() that removes an 
    // employee from the staff arrayList (the employee s empNum is a parameter).
    public boolean removeStaff(int empNum ) {
        boolean FoundAndRemoved = false;
        for (Employee emp : staff) {
            if (emp.getEmpNum() == empNum) {
                staff.remove(emp);
                FoundAndRemoved = true;
            }
        }
        return FoundAndRemoved;
    }

}

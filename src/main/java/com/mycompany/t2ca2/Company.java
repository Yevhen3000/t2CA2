/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2ca2;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @date start    19/02/24
 * @author  Yevhen Kuropiatnyk
 * @email   evgeniy.kuropyatnik@gmail.com
 * @student sba23066
 */
public class Company {
    
    private String companyName;
    private ArrayList<Employee> staff;
    private HashSet<Employee> staffSet;
    
    public Company(){
        companyName = "defCompanyName";
        staff = new ArrayList<>();
        staffSet = new HashSet<>(); 
    }
    
    public Company(String companyNme){
        companyName = companyNme;
        staff = new ArrayList<>();
        staffSet = new HashSet<>(); 
    }
    
    public void addNewStaff(Employee empl) {
        staff.add(empl);
        //staffSet.add(empl); // Bonus challenge
    }
    
    public int getStaffNumber() {
        return staff.size();
        //return staffSet.size(); // Bonus challenge
    }
    
    public void listEmployees(int employee_number ){
        for (Employee emp : staff) {
            if (emp.getEmpNum() > employee_number) {
                System.out.println(emp.getName());
            }
        }

// ------- Bonus challenge ------
//        for (Employee emp : staffSet) {
//            if (emp.getEmpNum() > employee_number) {
//                System.out.println(emp.getName());
//            }
//        }         
        
    }

    public void listAllEmployees(){
        System.out.println("-#-|-------- name --|------ email ----|");
        for (Employee emp : staff) {
            System.out.println(emp.getEmpNum() + " | " + emp.getEmail() + " |");
        }
    }
    
    public void removeStaff(int empNum ) {
        staff.remove(empNum);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2ca2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class EmployeeTest {
    
    public void main(){
        
        Employee empl1 = new Employee("Joe Bloggs","jb@gmail.com");
        Employee empl2 = new Employee("Ann Banana","ab@gmail.com");
        Employee empl3 = new Employee("Tom Thumb","tt@gmail.com");
        
        ArrayList<Employee> projectGroup = new ArrayList<>();
        projectGroup.add(empl1);
        projectGroup.add(empl2);
        projectGroup.add(empl3);
        
        
//        for (int i = 0; i < projectGroup.size(); i++) {
//            System.out.println("Employee " + (i + 1) + ": " + projectGroup.get(i).getEmpNum());
//        }
        
        System.out.println("getNextEmpNum: " + Employee.getNextEmpNum());
        
    }
    
}
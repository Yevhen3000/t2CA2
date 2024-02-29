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
        
        int m = 2;
        // Search and display names of employees with employee number above m
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }
        
        // Let a manager log in
        Company company = new Company();
        company.addNewStaff(empl1);
        company.addNewStaff(empl2);
        company.addNewStaff(empl3);
        
        Manager man1 = new Manager("Gnomeo","smurf");
        Menu mainmenu = new Menu(company);
        
        
        mainmenu.selectEmployeerToRemove();
        
        //company.listAllEmployees();
        //mainmenu.mainLoop(); // For debug only
        
//        if (empl1.isEmailValid("mail@gmail.com")) {
//            System.out.println("mail is ok");
//        } else {
//            System.out.println("mail is NOT valid!");
//        }
        
//        mainmenu.DoAuthorization(man1);
//        if (man1.getAuthorized()) {
//            mainmenu.mainLoop();
//        }
        
    }
    
}

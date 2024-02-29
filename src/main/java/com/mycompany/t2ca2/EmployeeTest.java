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
        
        // B1 - creates 3 Employee objects, with the following details
        Employee empl1 = new Employee("Joe Bloggs","jb@gmail.com");
        Employee empl2 = new Employee("Ann Banana","ab@gmail.com");
        Employee empl3 = new Employee("Tom Thumb","tt@gmail.com");
        
        //declares an array, called projectGroup, to store these 3 Employee objects and loads the array with the objects.
        ArrayList<Employee> projectGroup = new ArrayList<>();
        projectGroup.add(empl1);
        projectGroup.add(empl2);
        projectGroup.add(empl3);

        //prints out the value of variable nextEmpNum to the terminal window. 
        System.out.println("getNextEmpNum: " + Employee.getNextEmpNum());
        
        // Search and display names of employees with employee number above m
        int m = 2;
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }
        
        //Challenge: Implement a check for a valid email address
        if (empl1.isEmailValid("somemail@gmail.com")){
            System.out.println("Email is ok");
        } else {
            System.out.println("Email is NOT valid!");
        }
        
        // Add employees to Company
        Company company = new Company();
        company.addNewStaff(empl1);
        company.addNewStaff(empl2);
        company.addNewStaff(empl3);
        
        // Let a manager log in
        Manager man1 = new Manager("Gnomeo","smurf");
        Menu mainmenu = new Menu(company);
        
        //mainmenu.selectEmployeerToRemove();
        //company.listAllEmployees();
        //mainmenu.mainLoop(); // For debug only
        
        mainmenu.DoAuthorization(man1);
        if (man1.getAuthorized()) {
            mainmenu.mainLoop();
        }
        
    }
    
}

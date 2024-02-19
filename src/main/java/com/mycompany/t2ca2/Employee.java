package com.mycompany.t2ca2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Employee {
    
    private static int nextEmpNum = 1;

    public static int getNextEmpNum() {
        return nextEmpNum;
    }

    public static void setNextEmpNum(int aNextEmpNum) {
        nextEmpNum = aNextEmpNum;
    }
    
    private String name;
    private String email;
    private int empNum;

    public Employee(String Name, String Email){
        name = Name;
        email = Email;
        empNum = nextEmpNum;
        nextEmpNum++;
    }
    
    public Employee(){
        name = "defName";
        email = "defEmail";
        empNum = nextEmpNum;
        nextEmpNum++;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length()>4 ) {
            this.email = email;
        } else {
            //Raise an error!
        }
    }

    public int getEmpNum() {
        return empNum;
    }
    
}

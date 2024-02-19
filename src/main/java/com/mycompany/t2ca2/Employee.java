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
    
    public Employee(){
        name = " ";
        email = " ";
        empNum = nextEmpNum;
        nextEmpNum++;
    }
    
    public Employee(String sName, String sEmail, int iEmpNum){
        name = sName;
        email = sEmail;
        empNum = iEmpNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }
    
}

package com.mycompany.t2ca2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @date start    19/02/24
 * @author  Yevhen Kuropiatnyk
 * @email   evgeniy.kuropyatnik@gmail.com
 * @student sba23066
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
            //Raise an error! throw new Exception("email must be more then 3 characters in lenght");
            System.out.println("email must be more then 3 characters in lenght");
        }
    }

    public int getEmpNum() {
        return empNum;
    }
    
    public boolean isEmailValid(String email) {
        boolean ret = true;
        Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        Matcher regMatcher = regexPattern.matcher(email);
        if(!regMatcher.matches()) ret = false;
        return ret;
    }
    
}
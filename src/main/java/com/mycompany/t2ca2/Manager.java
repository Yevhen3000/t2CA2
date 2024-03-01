/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2ca2;

/**
 * @date start    19/02/24
 * @author  Yevhen Kuropiatnyk
 * @email   evgeniy.kuropyatnik@gmail.com
 * @student sba23066
 */

//One constructor initialises the name and email instance fields with default values. 
public class Manager extends Employee {
    private String username;
    private String password;
    private boolean authorized = false;
    
    //The other constructor initialises these fields with values passed as parameters.
    public Manager(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }  
    
    public boolean getAuthorized() {
        return authorized;
    }
    
    public void setAuthorized(boolean auth) {
        this.authorized = auth;
    }  
    
}

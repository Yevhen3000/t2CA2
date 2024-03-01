/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2ca2;

import java.util.Scanner;

/**
 * @date start    19/02/24
 * @author  Yevhen Kuropiatnyk
 * @email   evgeniy.kuropyatnik@gmail.com
 * @student sba23066
 */

public class Menu { 
    
    private Scanner sc;
    private Company company;
    private Manager manager;
    
    //Init menu and pass company instance object
    public Menu(Company comp) {
        company = comp;
    }

    // Show main menu to manager and promt
    // *As there is no front-end requirement or specification OR limitation
    public void ShowPromt() { 
        System.out.println("################# Manager menu #############");
        System.out.println("#                                          #");
        System.out.println("#  [1] View employees                      #");
        System.out.println("#  [2] Add employee                        #");
        if (company. getStaffNumber()!=0) System.out.println("#  [3] Remove employee                     #");
        System.out.println("#  [0] Exit                                #");
        System.out.println("#                                          #");
        System.out.println("############################################");
        System.out.println("Please, enter the menu command number:");        
    }       
    
    public void mainLoop(){
        String choice;              // Holds manager's input string
        sc  = new Scanner(System.in);
        while (true) {              // General menu cycle
            ShowPromt();            // Show main menu
            try {
                if (sc.hasNext()) {
                    choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            // List employees
                            company.listAllEmployees();
                            break;

                        case "2":
                            //Add new employee
                            String newEmpName = UserGetNewEmployeeName();
                            String newEmpEmail = UserGetNewEmployeeEmail();
                            Employee newEmp = new Employee(newEmpName,newEmpEmail);
                            company.addNewStaff(newEmp);
                            break;

                        case "3":
                            //Remove an employee
                            selectEmployeerToRemove();
                            break;

                        case "0":
                            //Exit
                            menuShutDown();
                            break;                      

                        default:
                            // User has entered string different from 1,2,3,0
                            System.out.println("Please, enter the correct menu number:");
                            break;                            
                    }
                }

            } catch (Exception e){
                System.out.println("Ops, enter a number, please!");
            }
        }          
    }

    // List employeers amd promt for manager who needs to be removed
    // *As there is no front-end requirement or specification OR limitation
    public void selectEmployeerToRemove(){
        company.listAllEmployees();
        System.out.println("Please, enter employeer's number for removing:");
        String choice="";              // Holds manager's input string
        sc  = new Scanner(System.in);
        try {
            choice = sc.nextLine();
        } catch (Exception e){
            System.out.println("Ops, enter a number, please!");
        }
        int empNumToRem = Integer.parseInt(choice);
        if (empNumToRem!=0) {
            if (company.removeStaff(empNumToRem)){
                System.out.println("Removed successfully");
            } else {
                System.out.println("Error upon removing");
            }
        } else {
            System.out.println("Error: number cant be zero!");
        }
    }
    
    //Method for obtainig a new user name from manager
    private String UserGetNewEmployeeName(){
        String Newname = "";
        boolean canGoOn = false;
       
        while(!canGoOn) { // Do while untill user enter new name
            do  {
                Newname = getUserInput("Please, enter a new user Name:");
            } while (Newname.isEmpty());
            canGoOn = true;
        }
        return Newname;
    }

    //Method for obtainig a new user email with validation from manager
    private String UserGetNewEmployeeEmail(){
        String NewEmail = "";
        boolean canGoOn = false;
               
        while(!canGoOn) { // Do while untill user enter new name
            do  {
                NewEmail = getUserInput("Please, enter a user's valid e-mail:");
            } while (NewEmail.isEmpty());
            if (manager.isEmailValid(NewEmail)) {
                canGoOn = true;
            } else {
                System.out.println("Email is not valid!");
            }
        }
        return NewEmail;
    }
    
    //Clear all up before exit
    private void menuShutDown() {
        System.out.println("Exiting...");
        sc.close();             // Release console resource
        System.exit(0);
    }
    
    //Handle user input with a promt (optional)
    public String getUserInput(String message){ // Get a string from user
        String useInput = "";
        sc  = new Scanner(System.in);
        boolean bInputOk = false;
        while (!bInputOk) {
            if (!message.equalsIgnoreCase("")) System.out.println(message); // Show a promt to user (optional)
            try {
                useInput = sc.nextLine();
                bInputOk = true;
            } catch (Exception e){
                System.out.println("Ops, something went wrong!");
            }
        }
        return useInput;
    }
    
    //Check user's name && password to level up him(her) to manager access level
    public void DoAuthorization(Manager man) { // username – “Gnomeo”; Password – “smurf”
        System.out.println("--- LOGIN ---");
        this.manager = man;
        String userName = "";
        String userPass = "";
        boolean canGoOn = false;
       
        while(!canGoOn) { // Do while untill user enters username
            do  {
                userName = getUserInput("Please, enter the username [CANCEL to exit]:");
            } while (userName.isEmpty());
            if(userName.equalsIgnoreCase("cancel")) return; // Check if the user wants to abort
            canGoOn = true;
        }
        
        canGoOn = false;
        while(!canGoOn) { // Do while untill user enters password
            do  {
                userPass = getUserInput("Please, enter the password [CANCEL to exit]:");
            } while (userPass.isEmpty());
            if(userPass.equalsIgnoreCase("cancel")) return; // Check if the user wants to abort
            canGoOn = true;
        }
        
        // if username && password ok - show manager's menu
        if (userName.equals(man.getUsername()) && userPass.equals(man.getPassword()) ){
            System.out.println("Welcome, " + man.getUsername() + "!");
            man.setAuthorized(true);
        } else {
            System.out.println("Wrong username or password!");
        }

        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2ca2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Menu {
    
    // Colors to brighten up the gray routine
    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_BLACK = "\u001B[30m";
    public final String ANSI_RED = "\u001B[31m";
    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_YELLOW = "\u001B[33m";
    public final String ANSI_BLUE = "\u001B[34m";
    public final String ANSI_PURPLE = "\u001B[35m";
    public final String ANSI_CYAN = "\u001B[36m";
    public final String ANSI_WHITE = "\u001B[37m";    
    
    private Scanner sc;
    
    private Company company = new Company();

    public void ShowPromt() { // Show main menu to manager and promt
        System.out.println(ANSI_PURPLE + "################# Manager menu #############" + ANSI_RESET);
        System.out.println(ANSI_PURPLE +"#                                         " + ANSI_PURPLE +" #");
        System.out.println(ANSI_PURPLE +"#  " + ANSI_BLUE + "[1] View employees" + ANSI_PURPLE +"                      #");
        System.out.println(ANSI_PURPLE +"#  " + ANSI_GREEN+ "[2] Add employee"  + ANSI_PURPLE +"                        #");
        System.out.println(ANSI_PURPLE +"#  " + ANSI_RED + "[3] Remove employee"  + ANSI_PURPLE +"                     #");
        System.out.println(ANSI_PURPLE +"#  " + ANSI_RED + "[0] Exit"  + ANSI_PURPLE +"                                #");
        System.out.println(ANSI_PURPLE +"#                                        " + ANSI_PURPLE +"  #");
        System.out.println(ANSI_PURPLE +"############################################" + ANSI_RESET);
        System.out.println("Please, enter the menu command number:");        
    }       
    
    public void mainLoop(){
        String choice;              // Holds manager's input string
        
        ShowPromt();                // Show main menu
        while (true) {              // General menu cycle
            try {
                if (sc.hasNext()) {
                    choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            company.listAllEmployees();
                            break;

                        case "2":
                            // ToDO: user input for new Name & email with verification
                            String newEmpName = "A";
                            String newEmpEmail = "B";
                            Employee newEmp = new Employee(newEmpName,newEmpEmail);
                            company.addNewStaff(newEmp);
                            break;

                        case "3":
                            //ToDO: List employeers and ask which to remove
                            company.listAllEmployees();
                            //Users'input for empNum to remove
                            break;

                        case "0":
                            menuShutDown();
                            break;                      

                        default:                   // User has entered string different from 1,2,3,4
                            System.out.println("Please, enter the correct menu number:");
                            break;                            
                    }
                }

            } catch (Exception e){
                System.out.println("Ops, enter a number, please!");
                //ShowPromt();                // Show main menu
            }
        }          
    }

    private void menuShutDown() {
        System.out.println("Exiting...");
        sc.close();             // Release console resource
        System.exit(0);
    }
    
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
    
    public void DoAuthorization(Manager man) { // let a manager to log in with: username – “Gnomeo”; Password – “smurf”
        System.out.println(ANSI_PURPLE + "--- LOGIN ---" + ANSI_RESET);
        
        String userName = "";
        String userPass = "";
        boolean canGoOn = false;
       
        while(!canGoOn) { // Do while untill user enter username
            do  {
                userName = getUserInput("Please, enter the username [CANCEL to exit]:");
            } while (userName.isEmpty());
            if(userName.equalsIgnoreCase("cancel")) return; // Check if the user wants to abort
            canGoOn = true;
        }
        
        canGoOn = false;
        while(!canGoOn) { // Do while untill user enter password
            do  {
                userPass = getUserInput("Please, enter the password [CANCEL to exit]:");
            } while (userPass.isEmpty());
            if(userPass.equalsIgnoreCase("cancel")) return; // Check if the user wants to abort
            canGoOn = true;
        }
        
        if (userName.equals(man.getUsername()) && userPass.equals(man.getPassword()) ){
            System.out.println("Welcome, " + man.getUsername() + "!");
            man.setAuthorized(true);
        } else {
            System.out.println("Wrong username or password!");
        }

        
    }
    
    
    
}

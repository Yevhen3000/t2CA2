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
    
    private Scanner sc  = new Scanner(System.in);
    

    public void ShowPromt() { // Show main menu to user and promt
                              // username – “Gnomeo”; Password – “smurf”)
        System.out.println(ANSI_PURPLE + "################# MAIN MENU ################" + ANSI_RESET);
        System.out.println(ANSI_PURPLE +"#                                        " + ANSI_PURPLE +"  #");
        System.out.println(ANSI_PURPLE +"#  " + ANSI_BLUE + "[1] View employees" + ANSI_PURPLE +"  #");
        System.out.println(ANSI_PURPLE +"#  " + ANSI_GREEN+ "[2] Add employee"  + ANSI_PURPLE +"  #");
        System.out.println(ANSI_PURPLE +"#  " + ANSI_RED + "[3] Remove employee"  + ANSI_PURPLE +"                                #");
        System.out.println(ANSI_PURPLE +"#                                        " + ANSI_PURPLE +"  #");
        System.out.println(ANSI_PURPLE +"############################################" + ANSI_RESET);
        System.out.println("Please, enter the menu command number:");        
    }        
}

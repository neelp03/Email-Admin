/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/
package com.neelp;

import javax.swing.*;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defPassLen = 12;
    private String department;
    private String email;
    private String alternateEmail;
    private String company = "company.com";
    private int mailboxCapacity = 750;

    //Constructor to receive the first and last name
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Name: " + firstName + " " + lastName);
        this.department = setDepartment();
        System.out.println("Department: " + department);
        this.password = genPassword(defPassLen);
        System.out.println("Your password is: " + this.password);

        //Combine everything to create email
        if(department.equals("")){
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"
                    + "" + company;
        }
        else {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"
                    + this.department.toLowerCase() + "-" + company;
        }

    }

    //private method to get the users department called in the constructor
    private String setDepartment(){

        int depChoice = Integer.parseInt(JOptionPane.showInputDialog("Department:\n1:\tSales \n2:\tDevelopment\n3:\tAccounting\n0:\tNone of the above\n "));
        switch(depChoice){
            case 1: return "Sales";
            case 2: return "Development";
            case 3: return "Accounting";
            default: return "";
        }
    }



    //private method to create a password with a specified length
    private String genPassword(int len){

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghisjklmnopqrtsuvwxyz!@#$%&";
        char[] pass = new char[len];

        for(int i = 0; i < pass.length; i++){
            int random = (int)(Math.random()*(letters.length()));
            pass[i] = letters.charAt(random);
        }
        return new String(pass);
    }



    //setter and getter methods
    public void setMailboxCapacity(int cap){
        this.mailboxCapacity = cap;
    }


    public void setAltEmail(String newEmail){
        this.alternateEmail = newEmail;
    }


    public void changePassword(String newPass){
        this.password = newPass;
    }



    public int getMailboxCapacity(){return mailboxCapacity;}

    public String getAlternateEmail(){return alternateEmail;}



    public String display(){
        return "Name: " + firstName + " " + lastName +
                "\nDepartment: " + department +
                "\nCompany email: " + email +
                "\nMailbox capacity: " + mailboxCapacity + " gb" +
                "\nAlternate email: " + alternateEmail;


    }
}

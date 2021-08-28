/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/
package com.neelp;

import javax.swing.*;


public class Email {
    private final String firstName;
    private final String lastName;
    private final String department;
    private final String email;
    private String alternateEmail;

    //Constructor to receive the first and last name
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        JOptionPane.showMessageDialog(null,"Name : " + firstName + " " + lastName);
        this.department = setDepartment();
        JOptionPane.showMessageDialog(null, "Department: " + this.department);
        int defPassLen = 12;
        String password = genPassword(defPassLen);
        JOptionPane.showMessageDialog(null,"Password: " + password);

        //Combine everything to create email
        String company = "company.com";
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


    public void setAltEmail(String newEmail){
        this.alternateEmail = newEmail;
    }


    public String display(){
        int mailboxCapacity = 750;
        return "Name: " + firstName + " " + lastName +
                "\nDepartment: " + department +
                "\nCompany email: " + email +
                "\nMailbox capacity: " + mailboxCapacity + " gb" +
                "\nAlternate email: " + alternateEmail;


    }
}

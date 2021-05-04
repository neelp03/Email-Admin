/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/

package com.neelp;

import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        Email email;
        Employees employees;
        ArrayList<Email> empArr = new ArrayList<Email>();

        int numEmployees = Integer.parseInt(JOptionPane.showInputDialog(null, "How many employees"
                + " would you like to add?"));

        for(int i = 0; i < numEmployees; i++){

            String firstName = JOptionPane.showInputDialog("Enter first name: ");
            String lastName = JOptionPane.showInputDialog("Enter last name: ");

            email = new Email(firstName, lastName);
            empArr.add(email);

            email.setAltEmail("example@example.com");
            //JOptionPane.showMessageDialog(null,"Alternate email: "+email.getAlternateEmail());

            JOptionPane.showMessageDialog(null,email.display());
        }

        employees = new Employees(empArr);
        employees.getEmpArr();


    }
}

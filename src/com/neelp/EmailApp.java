/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/

package com.neelp;

import javax.swing.*;
import java.util.ArrayList;

public class EmailApp {

    public static void main(String[] args) {

        Email email;
        Employees employees;
        ArrayList<Email> empArr = new ArrayList<>();

        int numEmployees = Integer.parseInt(JOptionPane.showInputDialog(null, "How many employees"
                + " would you like to add?"));

        for(int i = 0; i < numEmployees; i++){

            String firstName = JOptionPane.showInputDialog("Enter first name: ");
            String lastName = JOptionPane.showInputDialog("Enter last name: ");

            email = new Email(firstName, lastName);
            empArr.add(email);

            email.setAltEmail("example@example.com");
            //JOptionPane.showMessageDialog(null,"Alternate email: "+email.getAlternateEmail());

            if(i<numEmployees-1) JOptionPane.showMessageDialog(null,"Add the next employee");
        }

        employees = new Employees(empArr);
        employees.getEmpArr();


    }
}

/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/

package com.neelp;

import javax.swing.*;

public class EmailApp {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void addInfo(Employees employees, int numEmployees) {
        for(int i = 0; i < numEmployees; i++){

            String firstName = JOptionPane.showInputDialog(
                    null,
                    "Enter first name: ",
                    "Email Administration Application",
                    JOptionPane.NO_OPTION
            );

            String lastName = JOptionPane.showInputDialog(
                    null,
                    "Enter last name: ",
                    "Email Administration Application",
                    JOptionPane.NO_OPTION
            );

            employees.add(new Email(firstName, lastName));

            employees.get(i).setAltEmail("example@example.com");
            //JOptionPane.showMessageDialog(null,"Alternate email: "+email.getAlternateEmail());

            if(i<numEmployees-1)
                JOptionPane.showMessageDialog(
                        null,
                        "                   Add the next employee",
                        "Email Administration Application",
                        JOptionPane.NO_OPTION
                );
        }
    }

    public static void main(String[] args) {

        Employees employees = new Employees();
        int numEmployees = 0;

        try {
            numEmployees = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "How many employees would you like to add?",
                            "Email Administration Application",
                            JOptionPane.OK_CANCEL_OPTION
                    )
            );
        } catch(Exception e) {
            String s = JOptionPane.showInputDialog(
                    null,
                    "Please enter a valid number\nDor type cancel to abort operation",
                    "Email Administration Application",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if(isNumeric(s)) {
                numEmployees = Integer.parseInt(s);
            } else {
                System.exit(0);
            }
            // if-else for still want to add employee
        }

        addInfo(employees, numEmployees);
        employees.getEmpArr();

        System.exit(0);
    }
}

/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/

package com.neelp;

import javax.swing.*;
import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("Enter first name: ");
        String lastName = JOptionPane.showInputDialog("Enter last name: ");

        Email email1 = new Email(firstName, lastName);
        email1.setAltEmail("example@example.com");
        JOptionPane.showMessageDialog(null,"Alternate email: "+email1.getAlternateEmail());
        JOptionPane.showMessageDialog(null,email1.display());
    }
}

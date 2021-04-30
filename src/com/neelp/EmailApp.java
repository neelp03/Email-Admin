/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/

package com.neelp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.next();
        System.out.print("\nEnter last name: ");
        String lastName = sc.next();

        Email email1 = new Email(firstName, lastName);
        email1.setAltEmail("example@example.com");
        System.out.println("Alternate email will be printed below: \n"+email1.getAlternateEmail() + "\n");

        System.out.println(email1.display());
    }
}

/*

@author - Neel Patel
Github profile: https://github.com/neel-p1103

*/
package com.neelp;

import javax.swing.*;
import java.util.ArrayList;

public class Employees extends ArrayList<Email>{

    public Employees() {
        super();
        JOptionPane.showMessageDialog(null,
                startUp(),
                "Email Administration Application",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public boolean add(Email e) {
        return super.add(e);
    }

    public void getEmpArr(){
        for(Email i : this){
            JOptionPane.showMessageDialog(null,i.display());
        }
    }

    public String startUp() {
        return "EMAIL ADMINISTRATION SOFTWARE " +
                "\n\n" +
                "                   starting...";
    }
}

package com.neelp;

import javax.swing.*;
import java.util.ArrayList;

public class Employees {
    private Email em1;
    private ArrayList<Email> empArr = new ArrayList<Email>();

    public Employees(ArrayList<Email> em) {
        this.em1 = em1;
        for(Email temp : em){
            empArr.add(temp);
        }
    }

    public void getEmpArr(){
        for(Email i : empArr){
            JOptionPane.showMessageDialog(null,i.display());
        }


    }

}

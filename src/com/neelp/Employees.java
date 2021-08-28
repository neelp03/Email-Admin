package com.neelp;

import javax.swing.*;
import java.util.ArrayList;

public class Employees {
    private final ArrayList<Email> empArr = new ArrayList<>();

    public Employees(ArrayList<Email> em) {
        empArr.addAll(em);
    }

    public void getEmpArr(){
        for(Email i : empArr){
            JOptionPane.showMessageDialog(null,i.display());
        }
    }
}

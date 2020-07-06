package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

      String wynik =  NumberFormat.getPercentInstance().format(0.1);
        System.out.println(wynik);
    }
}


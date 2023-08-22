package com.nam.uitesting;

import java.util.Scanner;

public class Uitesting 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        form1 f = new form1();
        f.setTitle("Testing");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

package com.JavaStudy;

import java.util.Scanner;

public class ScannerClassUse {
    public static void main(String [] args ){
        Scanner scan=new Scanner(System.in);
        float val1,val2;
        System.out.println("Enter two float values: \n");
        val1=scan.nextFloat();
        val2=scan.nextFloat();
        System.out.println("Sum: "+(val1+val2));
    }
}

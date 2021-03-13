package com.JavaStudy;

import java.util.Scanner;

public class OperatorsUses {

    public static void main(String [] args){
        System.out.println("Enter 6 digits");
        Scanner scanner=new Scanner(System.in);
        float v1,v2,v3,v4,v5,v6;
        v1=scanner.nextFloat();
        v2=scanner.nextFloat();
        v3=scanner.nextFloat();
        v4=scanner.nextFloat();
        v5=scanner.nextFloat();
        v6=scanner.nextFloat();
        System.out.println("Simplification: "+(v1+v2+v3+v4+v5+v6));

    }
}

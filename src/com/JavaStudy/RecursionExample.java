package com.JavaStudy;


import java.util.Scanner;

public class RecursionExample {


    static int factroial(int n){
        if(n==0 || n==1){
            System.out.print(n+"*");
            return 1;
        }else{
            System.out.print(n+"*");
            return n*factroial(n-1);
        }



    }

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for factorial: ");
        int num=sc.nextInt();
        System.out.println("\b  Ans is: "+factroial(num));
    }
}

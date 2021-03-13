package com.JavaStudy;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String getMessage() {
        return  "My custom exception ";
    }
    @Override
    public  String toString(){
        return super.toString()+"toString method()";

    }
}

public class CustomException {
    public static void main(String [] args){
        int a=0;
        Scanner sc=new Scanner(System.in);
        while(a<40){
            a=sc.nextInt();
            try{
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println("Other programs running");
            }
        }


    }

}

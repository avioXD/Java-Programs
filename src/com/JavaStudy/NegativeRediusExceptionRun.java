package com.JavaStudy;

import java.util.Scanner;

class NegativeRediusException extends Exception{
    @Override
    public String getMessage() {
        return "Redius can't be Negative!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Area {
    public static double getArea(double r) throws NegativeRediusException{
       if(r<0) {
           throw new NegativeRediusException();
       }
       return Math.PI * r * r;
    }

}
public class NegativeRediusExceptionRun {
   public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the redius of the a circle: ");
       double red=sc.nextDouble();
       try{
           double area= Area.getArea(red);
           System.out.println("Area is :"+String.format("%.2f",area));
        } catch (NegativeRediusException e) {
           System.out.println(e.getMessage());
       }

   }

}

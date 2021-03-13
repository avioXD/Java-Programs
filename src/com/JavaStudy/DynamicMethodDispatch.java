package com.JavaStudy;
class One{
        public void on(){
            System.out.println("Turning on One");
        }

}
class Two extends One{
    public void on(){
        System.out.println("Turning on Two");
    }

}
public class DynamicMethodDispatch {
    public static void main(String [] args){
        One obj=new Two();
        obj.on();

    }

}

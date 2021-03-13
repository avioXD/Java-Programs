package com.JavaStudy;
interface Bicycle{
    void applyBreak();
    default void speedUp(){
        System.out.println("default speed up");
    }

}
class TataCycle implements Bicycle{
    public void applyBreak(){
        System.out.println("Applying Break");
    }
    public void speedUp(){
        System.out.println("Applying speed");
    }
}
class AvonCycle implements Bicycle{
    public void applyBreak(){
        System.out.println("Applying Break");
    }
}
public class InterfaceRun {
    public static void main(String [] args){
        TataCycle newCycle=new TataCycle();
        newCycle.applyBreak();
        newCycle.speedUp();
        AvonCycle newAvon= new AvonCycle();
        newAvon.applyBreak();
        newAvon.speedUp();

    }
}

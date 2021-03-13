package com.JavaStudy;

import java.util.Scanner;
class BoxSet{
    private int height,width;
    public BoxSet(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int getArea(){
        return height*width;
    }

}
public class BoxSetMain {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height and width of a box : -> ");
        BoxSet box=new BoxSet(sc.nextInt(),sc.nextInt());
        System.out.println("Area of Box :"+box.getArea());

    }
}

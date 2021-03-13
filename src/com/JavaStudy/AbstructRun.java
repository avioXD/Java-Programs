package com.JavaStudy;
abstract class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }

   abstract public void abstructFun(int a);

}
class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
    @Override
    public void abstructFun(int a){
        System.out.println("Abstruct function "+a);
    }

}
public class AbstructRun {
    public static void main(String [] args){
        Child child= new Child();
        child.abstructFun(4);
        Parent p= new Parent() {
            @Override
            public void abstructFun(int a) {
                System.out.println("Parent Class " +a);
            }
        };
        p.abstructFun(5);
        System.out.println();

    }
}

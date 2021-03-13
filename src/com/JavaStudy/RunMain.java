package com.JavaStudy;
class ClassA {
    public void fun1(){

        System.out.println("This is Class A fun1");
    }
}
class ClassB extends ClassA{
    @Override
    public void fun1(){
        System.out.println("this is class b fun1 ");

    }

}
class ClassC extends ClassB{
    public ClassC(){
    }
    @Override
   public void fun1(){
        System.out.println("this is class c fun1 ");
    }
}

public class RunMain {


    public static void main(String [] args){
        ClassB b=new ClassB();
        b.fun1();

        ClassC c=new ClassC();
        c.fun1();
    }

}

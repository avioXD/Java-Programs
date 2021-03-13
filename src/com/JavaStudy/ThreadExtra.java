package com.JavaStudy;
class MyThreadTest1 extends Thread{
    public MyThreadTest1(String str){
        super(str);
    }
    @Override
    public void run(){
        for(int i=0;i<30;i++)
            System.out.println("My Thread one Running");
    }

}
class MyThreadTest2 extends Thread{
    public MyThreadTest2(String str){
        super(str);
    }
    @Override
    public void run(){
        for(int i=0;i<30;i++)
            System.out.println("My Thread two Running");
    }

}
public class ThreadExtra {

    public static  void main(String[] args){
        MyThreadTest1 T1=new MyThreadTest1("Thread1");
        MyThreadTest2 T2= new MyThreadTest2("Thread2");
        T1.start();
        T2.start();
        System.out.println("Thread Id: "+T1.getId()+" "+T1.getName());
        System.out.println("Thread Id: "+T2.getId()+" "+T2.getName());
    }
}

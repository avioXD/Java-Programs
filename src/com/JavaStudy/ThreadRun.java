package com.JavaStudy;

class MyThread extends Thread{
    @Override
    public void run(){
     while(true){
            System.out.println("myThread 1 is runng");
            System.out.println("So lets do party!");
    }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("myThread 2 is runng");
            System.out.println("So lets do Job!");
        }
    }
}

public class ThreadRun {
    public static void main(String [] str){
        MyThread t1=new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }

}

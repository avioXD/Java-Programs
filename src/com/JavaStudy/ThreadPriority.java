package com.JavaStudy;
class ThreadPrio1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println("This is my first Thread: "+(i++));
        }
    }
}
class ThreadPrio2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println("This is my second Thread: "+(i++));
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args){
        ThreadPrio1 p1=new ThreadPrio1();
        ThreadPrio2 p2=new ThreadPrio2();
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();
    }
}

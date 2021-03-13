package com.JavaStudy;
class Bullet1 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Bullet 1 throwing");
        }
    }
}
class Bullet2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Bullet 2 throwing");
        }
    }
}
public class RunnableInterface {

    public static void main(String [] args){
       Bullet1 b1=new Bullet1();
       Bullet2 b2=new Bullet2();

       Thread gun1=new Thread(b1);
       Thread gun2=new Thread(b2);
       gun1.start();
       gun2.start();

    }
}

package com.JavaStudy;
class FinallyExe{
    private int a;
    public int run(int n){
       try{
           a=n;
           return a;
       }catch (Exception e){
           System.out.println(e.getMessage());
       }finally {
           a=0;

       }
       return 0;
    }

    public int getA() {
        return a;
    }
}
public class FinallyUseRun {
    public static void main(String [] args){
        FinallyExe newExe=new FinallyExe();
        System.out.println(newExe.getA());
        System.out.println(newExe.run(4));

    }
}

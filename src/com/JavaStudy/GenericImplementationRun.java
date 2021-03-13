package com.JavaStudy;


/**
 *
 *
 *
 */
class MyGeneric<T1,T2>{
    protected T1 t1;
    protected T2 t2;
    public MyGeneric(T1 t1,T2 t2) {
        this.t2=t2;
        this.t1=t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}


public class GenericImplementationRun {
    public static void main(String [] args){
        MyGeneric<String,Integer> g1=new MyGeneric("MyString",45);
        String str1= g1.getT1();
        System.out.println(str1);
        Integer int1=g1.getT2();
        System.out.println(int1);

    }
}

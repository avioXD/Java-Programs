package com.JavaStudy;



public class MultiDimensionalArray {
    public static void main(String [] args){
        int [][] flat2;

        flat2=new int[2][2];

        flat2[0][0]= 101;
        flat2[0][1]= 102;
        flat2[1][0]= 104;
        flat2[1][1]= 105;
        for (int[] ints : flat2) {
            for (int f = 0; f < flat2.length; f++)
                System.out.println(ints[f] + "\n");

        }

    }
}

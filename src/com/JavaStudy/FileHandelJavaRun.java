package com.JavaStudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandelJavaRun {
    public static void main(String [] args){
        File myFile= new File("myfile.txt");
        try {
            myFile.createNewFile();
        }catch (Exception e){
            myFile.delete();
            myFile= new File("myfile.txt");
            System.out.println("Unsable to create... ");
            e.printStackTrace();

        }



        // Code to write to a file
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("This is my file writer file  ,Author naruto3_3");
            System.out.println("Written");
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Scanner sc=new Scanner(myFile);
            while(sc.hasNext()){
                String line=sc.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

package com.java.interview.CoreJava.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException_2 {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader ( "Notes.txt" );
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace ();
        }
        System.out.println ("rest of the code");
    }
}

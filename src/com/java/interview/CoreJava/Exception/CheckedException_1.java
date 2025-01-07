package com.java.interview.CoreJava.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException_1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader=new FileReader ( "Notes.txt" );
    }
}

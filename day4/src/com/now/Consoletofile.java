package com.now;

/**
 * Created by gadalaya on 7/8/2017.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class Consoletofile {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("abcde.txt");
            PrintStream ps=new PrintStream(fout);
            System.setOut(ps);
            System.out.println("writing from typing");
            System.out.println("into file");
        }
        catch (IOException e){
            System.out.println("exception");
        }
    }
}
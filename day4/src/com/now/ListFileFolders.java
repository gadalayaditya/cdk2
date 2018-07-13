package com.now;

/**
 * Created by gadalaya on 7/8/2017.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.PrintStream;
public class ListFileFolders {
    public static void main(String args[]){
        File dir= new File("C:\\");
        String[] files=dir.list();
        if(files==null){
            System.out.println("no files");
        }
        else{
            for(int i=0;i<files.length;i++){
                System.out.println(files[i]);
            }
        }
    }
}
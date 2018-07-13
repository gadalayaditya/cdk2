package com.now;

/**
 * Created by gadalaya on 7/7/2017.
 */
class PrintString extends Thread {
    String str;
    PrintString (String str){
        this.str = str;
    }
    public void run() {
        for(int i=0; i<3; i++)
        System.out.println(str);
    }
}
public class Print {
    public static void main(String [] args) {
        PrintString obj1 = new PrintString("hello");
        PrintString obj2 = new PrintString("how u doing");
       // obj1.setPriority(Thread.MAX_PRIORITY - 2);
        //obj2.setPriority(Thread.MAX_PRIORITY -3);
        obj1.start();
        obj2.start();
        System.out.println("done");
    }
}

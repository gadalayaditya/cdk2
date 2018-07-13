package com.ass;

/**
 * Created by gadalaya on 7/7/2017.
 */
/**
 * Created by gadalaya on 7/7/2017.
 */
class Print extends Thread {
    String str;
    Print (String str){
        this.str = str;
        setName("Thread:"+ str);
        System.out.println(getName());
        try {
            if (getName().equals("Threadhello"))
                join();
        }
        catch(Exception e) {
            System.out.println("thread Interrupted");
        }
    }

    public void run() {

        for(int i=0; i<3; i++)
            System.out.println(str);
    }
}
public class Joina {
    public static void main(String [] args) {
        Print obj1 = new Print("hello");
        Print obj2 = new Print("how u doing");
        // obj1.setPriority(Thread.MAX_PRIORITY - 2);
        //obj2.setPriority(Thread.MAX_PRIORITY -3);
        obj1.start();
        obj2.start();
        System.out.println("done");
    }
}


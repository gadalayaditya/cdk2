package com.ass;

/**
 * Created by gadalaya on 7/7/2017.
 */
class A  extends Thread {
    public void run() {
        System.out.println("child");
    }
}
public class PriorityMain {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        t.setPriority(Thread.MAX_PRIORITY );
        A t1 = new A();
       // try{
            t1.start();

        System.out.println("main");
    }
}

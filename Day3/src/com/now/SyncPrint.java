package com.now;

class Sprint extends Thread{
    String s1;
    Sprint(String s1) {
        this.s1 = s1;
    }
    public void run(){
        Print(s1);
    }
    void Print(String s1) {
        for(String s : s1.split("\\s")) {
             message( s);
        }
    }
   synchronized void message(String s) {
        for(int i=0; i <s.length(); i++)
        System.out.print(s.charAt(i));
        System.out.println();
   }
}


public class SyncPrint{
    public static void main(String args[])
    {
        Sprint t1 = new Sprint("Hello how are you");
        Sprint t2 = new Sprint("yes am doing");
        Sprint t3 = new Sprint ("it is a third");
        Sprint t4 = new Sprint("fourth its");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
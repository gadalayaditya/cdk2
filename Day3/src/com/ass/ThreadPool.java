package com.ass;

/**
 * Created by gadalaya on 7/10/2017.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;
class Th extends Thread{
    int a,f=1;
    Th(int a){
        this.a=a;
    }
    public void run(){
        int i=a;
        while(i!=0){
            f=f*i--;
        }
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println("error");
        }
        System.out.println(Thread.currentThread()+ " factorial of " +a+" "+ f);
    }
}
public class ThreadPool {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ExecutorService es = Executors.newFixedThreadPool(5);
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        //Th thread[];
        for (int i = 0; i < 10; i++) {
            Runnable t = new Th(a[i]);
            es.execute(t);//calling execute method of ExecutorService
        }

        es.shutdown();
        sc.close();

    }

}
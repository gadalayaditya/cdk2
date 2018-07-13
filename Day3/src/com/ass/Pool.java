package com.ass;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;
/**
 * Created by gadalaya on 7/7/2017.
 */
class Factorial implements Runnable {
   int []a;int m;
   Factorial(int [] a) {
        this.a = a;
        m=1;
    }
    public void run() {
        for(int j =0 ; j<5; j++) {
            m=1;
            for (int i = 1; i <= a[j]; i++)
                m *= i;

            System.out.println(m);
        }
    }

}
public class Pool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        //creating a pool of 5 threads

            Scanner sc = new Scanner(System.in);
            int [] a= new int [5];

            for(int i= 0; i < 5 ; i++)
             a[i] = sc.nextInt();
            Runnable fact = new Factorial(a);
            es.execute(fact);//calling execute method of ExecutorService


       /*
        * Two different methods are provided. The shutdown() method will allow previously submitted tasks to execute
        * before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.
        * Upon termination, an executor has no tasks actively executing, no tasks awaiting execution, and no new tasks can be submitted.
        */

        es.shutdown();
        System.out.println("shutdown() invoked");
        while (!es.isTerminated());

        System.out.println("Finished all threads");
    }
}
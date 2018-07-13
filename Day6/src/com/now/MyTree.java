package com.now;

import java.util.*;

/**
 * Created by gadalaya on 7/11/2017.
 */
class A {
     int a;
    public A(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
class B extends A {
   int a;
    public B(int a) {
        super(a);
        this.a= a;
    }
}

public class MyTree {

    public static void main(String a[]) {
        MyComp1 comp_obj = new MyComp1();
        B ob1 = new B(2);
        B ob2 = new B(2);
        B ob3 = new B(3);
        TreeMap<A, String> hm = new TreeMap<A, String>(comp_obj);

        //add key-value pair to TreeMap
        hm.put(ob1, "language");
        hm.put(ob2, "machine");
        hm.put(ob3, "country");
        hm.put(ob2, "ksjfhgikure");


      //  System.out.println("Value: " + hm.get("ajfdshfsf"));
        Set s = hm.entrySet();
        Iterator itr1 = s.iterator();
        int i = 0;
        while (itr1.hasNext()) {//Entry is inner interface in Map interface

            Map.Entry me = (Map.Entry) itr1.next();
            System.out.println("\nKey:" + me.getKey() + " " + "\nvalue:" + me.getValue());
        }
    }
}
class MyComp1 implements Comparator<A> {
    public int compare(A obj1, A obj2) {
        //return str1.compareTo(str2);
        //return str2.compareTo(str1);
        return obj1.a-obj2.a;
    }
}
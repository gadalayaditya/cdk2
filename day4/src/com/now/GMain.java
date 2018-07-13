package com.now;

/**
 * Created by gadalaya on 7/8/2017.
 */
class Vehicle {
    private String vno;
    Vehicle (String vno) {
        this.vno = vno ;
    }
}
class Insurance {
    public int ino;
    Insurance (int ino) {
        this.ino = ino ;
    }
    void printp() {
        System.out.println("hello");
    }
}
class Gexam <T1,T2> {
    T1 ok;
    T2 ot;
    Gexam (T1 a, T2 b) {
        ok=  a;
        ot = b;
    }
  //  System.out.print(ot.ino);
}
public class GMain {
    public static void main(String[] args ) {
        Vehicle v1 = new Vehicle("Ts 009");
        Insurance i1 = new Insurance(90000009);
        Gexam<Vehicle, Insurance> g1 = new Gexam<>(v1, i1);
    }

}


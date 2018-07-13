package com; /**
 * Created by gadalaya on 7/10/2017.
 */
import java.io.Serializable;

class Address implements Serializable{
    String street;
    String city;
    int postalcode;
    Address(String s, String c, int p) {
        street = s;
        city = c;
        postalcode = p;
    }
}
class Vehicle implements Serializable{
    String regNo;
    String model;
    boolean insurance;
    Address addr;
    transient String image;
    Vehicle (String r, String m, boolean i, Address a, String image) {
        regNo = r;
        model = m;
        insurance = i;
        addr = a;
        this.image = image;
    }

}
class VehicleArray implements Serializable{
    Vehicle arr[];

    VehicleArray(Vehicle arr[])
    {
        this.arr = arr;
    }
}

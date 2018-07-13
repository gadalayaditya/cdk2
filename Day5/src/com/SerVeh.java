package com;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by gadalaya on 7/10/2017.
 */
public class SerVeh {
    public static void main(String[] args)
    {
        try
        {
//Serialization starts here

            Address a1 = new Address("street 10", "hyd", 5000033);
            Address a2 = new Address("street 5", "hyd", 5000029);
            Address a3 = new Address("street 1", "bang", 5000678);
                Vehicle v1 = new Vehicle("A12345", "a1", true, a1, "good" );
               Vehicle v2 = new Vehicle("A12345", "a1", true, a2, "good" );
               Vehicle v3 = new Vehicle("A12345", "a1", true, a3, "good" );
           Vehicle varr[] = {v1, v2, v3};

            VehicleArray va = new VehicleArray(varr);

            //  Vehicle v[] = new StudentInfo("testpurpose", 318);

            //.ser is a standard file extension, to store serialized object
            FileOutputStream f1 = new FileOutputStream("veh.ser");

            //instead of writing object stream to a file, it is also possible to send object thru
            //Network using socket programming
            ObjectOutputStream oos1 = new ObjectOutputStream(f1);

            System.out.println("Serialing the object...");
            oos1.writeObject(va);
            oos1.close();
            f1.close();
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }
}

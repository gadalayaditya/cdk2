package collections; /**
 * Created by gadalaya on 7/10/2017.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class ArrayListDemo {
    public static void main(String[] args) {
        //List allows duplicate values, stores values in the order given/added
        //Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
        VehicleInfor ve1,ve2,ve3;
        ve1=new VehicleInfor("786278y","idoiwh2");
        ve2=new VehicleInfor("786278skl","idoiwhdj");
        ve3=new VehicleInfor("78627w","idoiwhss");

        ArrayList<VehicleInfor> al = new ArrayList<>();

        al.add(ve1);
        al.add(ve2);
        al.add(ve3);

        dArrayList("Original ArrayList: ", al);

        Collections.reverse(al);

        dArrayList("After Reversing: ",al);
        System.out.println("-------------------------");

        Collections.shuffle(al);

        dArrayList("After Shuffling ",al);
    }

    static void dArrayList(String str, ArrayList<VehicleInfor> al)
    {
        System.out.println("------------------------------");
        System.out.println(str);
        Iterator<VehicleInfor> itr = al.iterator();
        //using Iterator, we can traverse only in forward direction
        for(;itr.hasNext();)
        {
            VehicleInfor infor = itr.next(); //returns Object
            System.out.println(infor);
        }
    }
}
class VehicleInfor {
    String regno;
    String modelno;
    VehicleInfor(String regno,String modelno){
        this.regno=regno;
        this.modelno=modelno;
    }

     /*String printVehicleInfor()
    {
        System.out.println("VehicleInfo details Test:"+regno+" "+modelno);
    }*/

    public String toString()
    {
        return "regno="+regno+", modelno="+modelno;
    }
}
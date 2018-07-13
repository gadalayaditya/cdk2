import java.util.Iterator;
import java.util.List;

/**
 * Created by gadalaya on 7/28/2017.
 */
public class Employee {
    private String ename;
    private List<Address> address ;

    public Employee() {
    }

    public Employee(String ename, List<Address> address) {
        this.ename = ename;
        this.address = address;
    }

    public void displayInfo(){

        System.out.println("address are:");
        for(Iterator<Address> itr =address.iterator(); itr.hasNext();){
          Address obj = itr.next();
            System.out.println(obj);
            System.out.println("/..............\\");
          obj.displayInfo();;

        }
    }
}

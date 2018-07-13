import java.util.Iterator;  
import java.util.List;  
  
public class Address{  
 
private List<String> addresss;
  
public Address() {}  
public Address( List<String> address) {  
 
    this.addresss = address;
    System.out.println("Address() constructor invoked");
}
    public void displayInfo(){

        System.out.println("address are:");
        for(Iterator<String> itr=addresss.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
    }


}

import java.util.List;


public class AnsAdapter implements IQue{
    
    private Answer obj;
    //Assume we do not have access to Answer code
    
    //constructor,
    public AnsAdapter(int ans_id, String ans_qn, List<String> ans_optns)
    {
        System.out.println("YOu are in AnsAdapter() Constructor");
        obj = new Answer(ans_id, ans_qn, ans_optns);//create an object
    }
    
    public void displayInfo(){
        System.out.println(obj.toString());
    }
}

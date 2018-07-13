
import java.util.Iterator;
import java.util.List;


public class Answer {
    private int ans_id;
    private String ans_qn;
    private List<String> ans_optns;
    
    public Answer(int ans_id, String ans_qn, List<String> ans_optns)
    {
        System.out.println("YOu are in Answer() Constructor");
        this.ans_id = ans_id;
        this.ans_qn = ans_qn;
        this.ans_optns = ans_optns;
    }
    
    public String toString()
    {
        Iterator<String> itr = ans_optns.iterator();
        
        String str = "";
        
        for(;itr.hasNext();)
        {   
            str += (String)itr.next();
            
            if(itr.hasNext())
            {
                str += ",";
            }
        }
        return "id="+ans_id+" qn="+ans_qn+" optns="+str;
    }
}

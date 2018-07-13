/**
 * Created by gadalaya on 7/6/2017.
 */
import java.util.Scanner;
public class exc  {
    public static void main(String [] args)  throws Exception{
        Scanner sc = new Scanner(System.in);
        String s= sc.next();

            if(s.contains("$") )
                throw new Exception("hello");
    }

}


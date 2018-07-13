/**
 * Created by gadalaya on 7/6/2017.
 */
public class stackover {
    public static void main(String[] args) {
        try{
            main(null);
        }
        catch(StackOverflowError e)
        {
            System.out.print("AN exception");
        }
    }
}

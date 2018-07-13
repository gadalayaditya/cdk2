//Create our own Exception
class InvalidPlanException extends Exception
{
    InvalidPlanException()
    {
        System.out.println("InvalidPlanException() constructor");
    }

    //its not mandatory to override toString() here
    public String toString()
    {
        return "This is only Test Exception";
    }
}

/* you can create an Exception class, from other Exception classes
class SomeException extends ArithmeticException{

}
*/

public class MyOwnExceptionDemo {
    public static void main(String[] args) throws Exception{
        try
        {
            int plan_type = -2;

            System.out.println("in main()");
            //based on the error situation, we have to manually throw InvalidPlanException,
            //coz JVM does not know about our scenario and InvalidPlanException
            System.out.println("b4 if");
            if(plan_type<1 || plan_type>4)
            {

                System.out.println("b4 throw");
                //InvalidPlanException ipe = new InvalidPlanException();
                InvalidPlanException ide =new InvalidPlanException();
                throw ide;
            }
            System.out.println("aft throw");
        }
        catch(InvalidPlanException te)
        {
            //te.printStackTrace();

            Class obj = te.getClass();
            String str = obj.getName();
            //How to get class name from an object
            System.out.println("Exception class name: "+str);
            System.out.println(te.toString());
        }

    }

}

class SomeRuntimeException extends RuntimeException
{
    SomeRuntimeException(String msg)
    {
        super(msg);

        System.out.println("Constructor ");
    }
}

class UnCheckedExceptionExample {
    public static void main(String args[])
    {
        //since SomeRuntimeException is Unchecked Exception
        //it is not mandatory to handle it or further throws it
        //try{
        int val = 0;

        System.out.println("Before throwing exception");

        if(val == 0)
        {
            SomeRuntimeException sre = new SomeRuntimeException("test message");
            throw sre;
        }

        System.out.println("After throwing exception");
		/*}catch(Exception et){
			System.out.println("Exception has occurred.............");
		}*/
    }
}

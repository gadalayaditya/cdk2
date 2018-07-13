import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class FCalculator implements Callable<Integer>
{
 
    private Integer number;
 
    public FCalculator(Integer number) {
        this.number = number;
    }
 
    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                
                //Just like Thread.sleep(), but has better code readability/understandability
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.println("Result for number - " + number + " -> " + result);
        return result;
    }
}


 
public class CallableEgSimple
{
      public static void main(String[] args) throws Exception
      {
          ThreadPoolExecutor executor = 
        	  (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
           
          Random random = new Random();
       
          Integer number = random.nextInt(10);
          FCalculator calculator  = new FCalculator(5);
          Future<Integer> result = executor.submit(calculator);
          //above result is returned by call() method implemented 
          //by class which implements Callable
          
          System.out.println(result.get().intValue());
	        //shut down the executor service
	        executor.shutdown();
      }
}

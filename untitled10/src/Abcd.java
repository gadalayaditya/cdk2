/**
 * Created by ADMIN on 7/2/17.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Abcd {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FirstJUnitEg.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }


        System.out.println("Total Failed Testcases:"+result.getFailureCount());

        System.out.println(result.wasSuccessful());

    }
}

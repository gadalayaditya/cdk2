/**
 * Created by ADMIN on 7/2/17.
 */
interface Abc{
    public void met();
}

public class Lambda1 {
    public static void main(String[] args) {
        Abc fa = ()->{
            System.out.println("Test Purpose");
        };
    }
}

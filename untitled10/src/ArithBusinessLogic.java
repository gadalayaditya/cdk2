/**
 * Created by ADMIN on 7/28/17.
 */

public class ArithBusinessLogic {
    private int a, b;
    private IArithService ias;

    void setIAService(IArithService ias)
    {
        this.ias = ias;
    }

    int add(int a, int b)
    {
        return ias.iadd(a,b);
    }

    int sub(int a, int b)
    {
        return ias.isub(a, b);
    }

    int mul(int a, int b)
    {
        return ias.imul(a, b);
    }
}

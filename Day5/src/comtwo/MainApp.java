package comtwo;

import java.lang.reflect.Method;

public class MainApp {

    public static void main(String[] args) {

        BusinessLogic bl = new BusinessLogic();
        Method[] methods = bl.getClass().getMethods();

        for (Method method : methods) {

            MyAnnotation run = method.getAnnotation(MyAnnotation.class);
            Object r[] = method.getAnnotations();
            if (run != null) {
                try {
                    for(int i=0 ;i<r.length ; i++)
                    System.out.println(r[i]);
                    method.invoke(bl);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 
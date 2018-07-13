import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
    public static void main(String[] args) {
        List<String> elecList = new ArrayList<String>();

        elecList.add("Monitor");
        elecList.add("Keyboard");
        elecList.add("Mouse");
        elecList.add("PenDrive");

        System.out.println("-------Iterate by passing lambda expression--------");

        elecList.forEach((elecItem) -> System.out.println(elecItem));

        //elecList.forEach((elecItem) -> {System.out.println(elecItem+" "+elecItem.length()); } );
    }
}  
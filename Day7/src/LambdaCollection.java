import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Product {
    int id;
    String name;
    float price;
    int warranty;
    public Product(int id, String name, float price, int warranty) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty =warranty;
    }
}
public class LambdaCollection{
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"Samsung A5",17000f,16));
        list.add(new Product(3,"Iphone 6S",65000f,12));
        list.add(new Product(2,"Sony Xperia",25000f,1));
        //list.add(new Product(4,"Nokia Lumia",15000f));
        //list.add(new Product(5,"Redmi4 ",26000f));
        //list.add(new Product(6,"Lenevo Vibe",19000f));

        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);
        //Stream<Product> filtered_warranty = list.stream().filter(p -> p.warranty)
//List ar1 = filtered_data.collect(Collectors.toLIst()); // to convert stream to list
        // using lambda to iterate through collection  
        filtered_data.forEach(
                prod -> System.out.println(prod.name+": "+ prod.price)
        );
        list.stream().forEach(
            p -> System.out.print(p.warranty+" ")
        );

        list.stream().forEach(c -> System.out.println(c.id));


    }
}  
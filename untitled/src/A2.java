class A2 {
    public String toString(){
        return "0";
    }
}
class call {
    public static void main(String []s){
        A2 a = new A2();
        System.out.print(a);
    }

}
abstract class A1 {
   void method(){
       System.out.print("a");
   }
 //abstract   void method1();
}
class B extends A1{
    public String toString(){
        return "0";
    }
}

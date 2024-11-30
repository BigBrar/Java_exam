import java.util.Vector;

public class vector {
 public static void main(String[] args){
    Vector<String> vector = new Vector<>();
    vector.add("deepinder");
    vector.add("lovepreet");
    vector.add("rahul");
    vector.remove(1);
    String name = vector.get(0);
    System.out.println("name is "+name);
    System.out.println("vector value is "+vector);
 }   
}

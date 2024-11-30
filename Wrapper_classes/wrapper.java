
public class wrapper {
    public static void main(String[] args){
        int age = 29;
        //Autoboxing: converting a primitive data type int to object Integer
        Integer ageObject = age;
        //Unboxing: converting back a object to integer.
        int convertedAge = ageObject;
        System.out.println("The ageObject value is "+ageObject);
        System.out.println("The convertedAge value is "+convertedAge);
    }
}

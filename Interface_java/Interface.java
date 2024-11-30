
interface newInterface{
    void show();
    int age = 29; // this becomes this after compilation - static final int age = 29;
}

interface anotherInterface extends newInterface{
}

class Deep implements newInterface, anotherInterface{
    public void show(){
        // age = 390;  //this won't work since age is a constant. 
        System.out.println("The value of age is "+age);
    }
}

public class Interface {
    public static void main(String[] args){
        Deep obj = new Deep();
        obj.show();
    }
}

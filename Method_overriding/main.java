class Parent{
    final void show(){
        System.out.println("parent class show invoked");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("child class show invoked");
    }
}

class main {
    public static void main(String[] args){
        Parent obj = new Parent();
        obj.show();
        Child obj1 = new Child();
        obj1.show();
    }
}
//without the final keyword in the parent class this code will work
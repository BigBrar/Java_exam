class Student{
    int age ;
    Student(){
        this.age = 19;
        System.out.println("Default constructor called.");
    }

    Student(int x){
        System.out.println("parameterised constructor called.");
    }

    Student(Student teacher){
        System.out.println("COpy constructor called.");
        teacher.age = 20;

    }
}

class constructor{
    public static void main(String[] args){
        Student obj = new Student();
        Student obj2 = new Student(obj);
        System.out.println("changed age = "+obj.age);
    }
}


public class myOwnException extends Exception{
    public myOwnException(){ //our own created custom exception constructor
        super("This is my own exception");
    }
}

public class exceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
        // int total = a/b;
        if (b == 0){
        throw new myOwnException();}; //custom exception being called
        }catch(Exception e){
            System.out.println("An unexpected exception occured ");
            System.out.println("Error message: "+e);
        }finally{
            System.out.println("Ran the Finally block");
        }
    }
}

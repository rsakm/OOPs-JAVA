package oops_ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally block");
        }
    }
}

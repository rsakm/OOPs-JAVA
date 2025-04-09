package oops_ExceptionHandling;

public class PrintExceptions {
    public static void main(String[] args) {
        int a = 100, b = 0, c;
        try {
            c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
//            System.out.println("************************ Method 1 **********************");
            e.printStackTrace();    // java.lang.ArithmeticException: / by zero
//            at oops_ExceptionHandling.PrintExceptions.main(PrintExceptions.java:7)
            System.out.println("************************** Method 2 ********************");
            System.out.println(e.getMessage());   // / by zero
            System.out.println("************************* Method 3.1 *********************");
            System.out.println(e.toString());    // java.lang.ArithmeticException: / by zero
            System.out.println("************************** Method 3.2 ********************");
            System.out.println(e);              // java.lang.ArithmeticException: / by zero
        }
        System.out.println("end of the program");
    }
}

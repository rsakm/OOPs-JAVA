package oops_ExceptionHandling;

public class UncheckedExceptions {
    public static void main(String[] args) {
        int a = 100, b=0, c;
        c = a/b;   /// programn compiles successfully, and exception is detected at run time
        System.out.println(c);


        String name = null;
        System.out.println(name);  /// NullPointerException at runtime
    }
}

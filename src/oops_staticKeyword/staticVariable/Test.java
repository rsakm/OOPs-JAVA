package oops_staticKeyword.staticVariable;

public class Test {
    int a = 10; ///// instance variable

    static int b = 16;   /// static variable

    void m1(){
//        static int i = 20;   //// Error
        int i = 20;
    }
}

class Demo{
    public static void main(String[] args) {
        System.out.println(Test.b); //// directly accessible, no need to create an instance for accessing it

    }
}

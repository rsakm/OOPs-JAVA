package oops_SuperKeyword;

//// Super keyword is a reference variable used to refer the immediate parent class object.

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }

}

class A{
    int a = 10;

}
class B extends A{
    int a = 20;
    void show(){
        System.out.println( "The parent class variable value is: "+super.a);
    }

}
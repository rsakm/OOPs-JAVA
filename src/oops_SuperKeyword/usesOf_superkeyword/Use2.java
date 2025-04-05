package oops_SuperKeyword.usesOf_superkeyword;
//// invoke immediate parent class method
public class Use2 extends A {

    void m1(){
        System.out.println("1. Child class method");
    }
    void show(){
        System.out.println("Calling from child class :");
        m1();
        super.m1();
    }

    public static void main(String[] args) {
        Use2 obj = new Use2();
        obj.show();
    }

}

class A{
    int a = 10;

    void m1(){
        System.out.println("2. Parent class method");
    }
}

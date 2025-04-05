package oops3_Polymorphism.methodOverriding;

public class Test {

    void show(){
        System.out.println("Parent class method");
    }
}

class Child extends Test{

    void show(){
        System.out.println("Child class overridden method");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();

        Test t = new Test();
        t.show();

        Test test = new Child();
        test.show();

//        Child child = new Test();   /// Incompatible type error
    }
}

package oops_staticKeyword.staticMethod;

public class Test {
    static void display(){
        System.out.println("Static method");
    }

    void show(){
        System.out.println("Non-static method");
    }

    public static void main(String[] args) {
        display();

//        // or

//        Test.display();
        Test t1 = new Test();
        t1.show();
    }
}

//// in other class call it with class name while in same class just call it normally
class UseTest{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        Test.display();
    }
}

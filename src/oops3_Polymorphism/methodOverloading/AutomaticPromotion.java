package oops3_Polymorphism.methodOverloading;

public class AutomaticPromotion {

    void show(int a){
        System.out.println("Int method");
    }

    void show(String a){
        System.out.println("String method");
    }

    void fun(int n){
        System.out.println("Integer argument");
    }

    void fun(Object obj){
        System.out.println("Object argument");
    }

    public static void main(String[] args) {
        AutomaticPromotion obj = new AutomaticPromotion();
        obj.show(3);
        obj.show("Raj");
        obj.show('a');  //// automatic promotion to int from char
        obj.fun('r');
        obj.fun("Raj");  //// String promoted to Object
    }
}

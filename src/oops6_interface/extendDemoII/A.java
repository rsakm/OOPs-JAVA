package oops6_interface.extendDemoII;

public interface A {

//    // static interface methods should always have body
//    // They are called via the interface name :---> A.greeting();
    static void greeting(){
        System.out.println("Static method inside interface A");
    }



    default void fun(){
        System.out.println("Default function inside A");
    }
}

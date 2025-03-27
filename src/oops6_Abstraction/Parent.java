package oops6_Abstraction;


// if a class contains one or more abstract method(s), it must also be declared as abstract.
// Abstract methods are the methods which are declared but don't have an implementation. They are meant to be overridden by subclasses.
// Abstract methods can only exist in abstract classes or interfaces.
//// All the subclasses must have to override the abstract methods of their parent class

public abstract class Parent {

    int age;
    abstract void carrer(String name);
    abstract void partner(String name, int age);

    static void info(){
        System.out.println("Hey I am inherited from Parent class.");
    }
//    Abstract classes can contain static methods.

    Parent(String address){
        System.out.println("I am from "+address);
    }


    void normal(){
        System.out.println("calling a normal method from Parent class");
    }
}

package oops3_Polymorphism;

public class Circle extends Shapes{

    @Override
    void info() {
        System.out.println("Informing from Circle Class...!");
    }

    static void greeting(){
        System.out.println("Greeting from static method of Circle class...!");
    }
}

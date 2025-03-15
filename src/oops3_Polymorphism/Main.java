package oops3_Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.info();
        circle.info();
        square.info();

        Shapes square1 =  new Square();
        square1.info();


        /*
        * Dynamic Method Dispatch (also known as Runtime Polymorphism).

Reference Type (Shapes square):

Decides what methods are accessible at compile time.
Since square is of type Shapes, you can only call methods that exist in the Shapes class.
✅ The compiler verifies that info() exists in Shapes — so the call is valid.
Object Type (new Square()):

Determines which method actually runs at runtime.
Since the object is of type Square and Square overrides the info() method, Java uses the child class’s version of info() at runtime.
This mechanism is called method overriding and relies on dynamic method dispatch. At runtime, Java looks at the actual object type (Square) and executes its version of the method, not the parent class’s.

🔑 Key Concept:
Instance variables are resolved at compile time based on the reference type.
Overridden methods are resolved at runtime based on the object type.
This is what makes polymorphism powerful in Java — you can write code that works on the parent type but behaves according to the actual object type at runtime.
*
* */

        Shapes circle1 = new Circle();
        circle1.greeting();
    }
}

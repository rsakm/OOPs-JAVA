package oops6_Abstraction;

public class Main {

    public static void main(String[] args) {

        Child child = new Child("Patna", 23);

        Parent.info();  /// static method from Parent class

        child.carrer("Software Engineer");

        System.out.println("I am "+child.age);

        child.partner("P ranjana", 22);

//        Parent dad = new Parent() ;   // you cannot create an object of an abstract class
//        Also you cannot create abstract constructors

        child.normal();


        System.out.println("This is daughter of parent class");


//        Even though we can not create an object of an abstract class, we can use it as a reference
        Parent daughter = new Child("Samastipur",20);
        daughter.carrer("CA");

    }
}

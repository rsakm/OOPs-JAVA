package oops3_Polymorphism.methodOverriding;

public class ExceptionsAndOverriding {

    void shows(){
        System.out.println("Parent class shows method");
    }
    void show(){
        System.out.println("Parent class does not throw any exception");
    }
}

class UncheckedOrNoException extends ExceptionsAndOverriding{

    void shows(){
        System.out.println("Child class shows method");
    }

    void show() throws ArithmeticException{
        System.out.println("Child class can throw only unChecked or no exception");
    }


    public static void main(String[] args) {
        ExceptionsAndOverriding obj = new ExceptionsAndOverriding();
        obj.show();
        obj.shows();

        UncheckedOrNoException ob = new UncheckedOrNoException();
        ob.shows();
        ob.show();

        ChildThrowsException o = new ChildThrowsException();
        o.fun();
    }
}


//// If parent class method doesn't theow any exception then child class overridden method can only throw either unchecked exception or no exception.
//// If parent class method throws an exception then child class overridden method can throw either same level exception or subclass exception of the parent class method's exceptionClass.

class ParentThrowsException{
    void fun() throws RuntimeException{
        System.out.println("Parent class method throws RunTimeException");
    }
}

class ChildThrowsException{
    void fun() throws ArithmeticException{
        System.out.println("Child class methods throws same level or subClass level exception");
    }
}
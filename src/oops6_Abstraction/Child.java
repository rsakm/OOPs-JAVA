package oops6_Abstraction;

public class Child extends Parent{

    Child(String address, int age){
        super(address);
        this.age = age;
    }

    @Override
    void carrer(String name) {
        System.out.println("I want to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+". She is "+age);

    }


}

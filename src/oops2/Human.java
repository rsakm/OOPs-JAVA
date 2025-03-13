package oops2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

//    // Static variable ---> universal for all objects of human class.
    static long population;


    public Human(int age,String name,int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population +=1;   // whenever a human object is created, population increase by 1. Also population of humans is same for all objects at a time, that's why it should be declared as static.
    }
}

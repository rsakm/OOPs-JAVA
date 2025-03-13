package introduction;

public class Constructor {
    public static void main(String[] args) {
//  // Constructor basically instantiated an object creation.
//  // It is a special function that runs when u create ab object

//        Employee raj = new Employee();

//        // Employee() is a constructor (by default)


        // just declaring
//        Employee raj;
//        raj = new Employee();

        Employee raj = new Employee(15, "Raj Maurya", 85.4f);
        Employee rahul = new Employee(18, "Rahul Rana", 90.3f);

//        raj.id = 13;
//        raj.name = "rajshree maurya";
//        raj.marks = 88.5f;


//        kunal.changeName("Shoe lover");
//        kunal.greeting();

//
        System.out.println(raj.id);
        System.out.println(raj.name);
        System.out.println(raj.salary);

        Employee random = new Employee(raj);
        System.out.println(random.name);

        Employee random2 = new Employee();
        System.out.println(random2.name);

        Employee one = new Employee();
        Employee two = one;

        one.name = "Something something";

        System.out.println(two.name);



    }





}

class Employee {
    int id;
    String name;
    float salary = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Employee  (Employee other) {
        this.name = other.name;
        this.id = other.id;
        this.salary = other.salary;
    }

    Employee () {
        // this is how you call a constructor from another constructor
        // internally: new Employee (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Employee arpit = new Employee(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Employee (int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}
//// this keyword is way of pointing the current object of a class.


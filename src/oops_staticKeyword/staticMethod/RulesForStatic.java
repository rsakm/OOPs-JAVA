package oops_staticKeyword.staticMethod;



//// A static method can access only static data. it cannot access non-static data i.e instance data
//// Non-static method cannot be referenced from a stattic method
//// A static method cannot refer to this or super keyword in anyway
public class RulesForStatic {

    int i = 10;
    static int a = 19;
    static void deisplay(){
//        System.out.println(i)
        System.out.println(a);
//        show();  // non static method cannot be referenced from a stattic method

//        System.out.println(this.i);  ////instance variable cannot be refrenced


// //       Rule 1   /// non-static variable i cannot be referenced from a static context (here method)
    }


    void show(){
        System.out.println("Non-static method");
        System.out.println(this.i);
    }
}

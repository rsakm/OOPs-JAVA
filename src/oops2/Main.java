package oops2;

public class Main {

    public static void main(String[] args) {

        Human raj = new Human(21,"Rajshree Maurya", 10000, false);
        System.out.println("Population when raj object was created: "+ Human.population);

        Human pj = new Human(21,"Priyaranjana Jha", 20000,false);
        System.out.println("Population when pj object was created: "+ Human.population);

        greeting();


//        // using nonstatic inside static by creating an instance of the class.
        Main obj1 = new Main();
        obj1.fun();

    }

//    // we know that somethimg nonstatic belongs to an object. So it's meaningless that calling a nonstatic greeting() inside static main(). That's why we wil have to make greeting() static.
    static void greeting(){
        System.out.println("Hii...!!!");
    }


    static void useNonStaticInStatic(){
        Main obj = new Main();
        obj.fun();
    }
    void fun(){
        System.out.println("maje karo...!!!");
    }
}

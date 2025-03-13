package oops2;

class Test2 {
     static String name;
    public Test2(String name){
        Test2.name = name;
    }
}

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
//        InnerClasses obj = new InnerClasses();

        Test a = new Test("raj");
        Test d = new Test("priyaranjana");
        System.out.println(a.name + " "+ d.name); //

        Test2 b = new Test2("Rajshree");
        Test2 c = new Test2("Priyaranjana");
        System.out.println(b.name);   // // prints Priyaranjana
        System.out.println(c.name);  // // prints Priyaranjana

    }
}

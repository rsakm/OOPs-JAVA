package oops6_interface.extendDemoII;

public class Main implements A,B{

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
        obj.fun();
        obj.greet();
    }


}

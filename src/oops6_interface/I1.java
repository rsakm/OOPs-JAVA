package oops6_interface;
interface I1 {

    int a = 10;  //// by default public static final

    void show();  //// by default public abstract

    default void fun(){

    }

    static void run(){

    }
}

interface I2{
    void display();
}
class Test implements I1, I2{

    @Override
    public void show() {
        System.out.println("Abstract method show");
    }


    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();
        obj.display();
    }

    @Override
    public void display() {
        System.out.println("Display method from Interface 2");
    }
}
package oops3_Polymorphism.methodOverloading;

public class Test {
    void show(){
        System.out.println("1");
    }

    void show(int n){
        System.out.println(n);
    }
    void args(int a , String name){
        System.out.println("Integer is the first argument");
    }

    void args(String name, int a){
        System.out.println("String is the first argument");
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.show(14);
        t.args(3,"Raj");
        t.args("Raj", 3);
    }
}

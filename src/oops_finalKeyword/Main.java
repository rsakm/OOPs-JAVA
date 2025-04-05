package oops_finalKeyword;

public class Main {

    public static void main(String[] args) {
        final int i = 10;
//        i=i+20;   ---->Error
        System.out.println(i);
    }
}


class A{
    final void method(){
        System.out.println("Parent class final method");
    }
}
class B extends A{

//    @Override   ////---> final method of parent class can not be overridden
//    void method() {
//        super.method();
//    }

}

final class C{

}
//class D extends C{   ////---> final class can not be inherited
//
//}
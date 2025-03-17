package oops5_AccessControls;

public class SubClass extends A{

    public SubClass(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(21,"Rajshree");

       int[] array = obj.arr;   ///// protected member can be accessed in the subclass inside same package.
    }
}

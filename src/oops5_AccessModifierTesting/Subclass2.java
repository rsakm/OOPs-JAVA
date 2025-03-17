package oops5_AccessModifierTesting;

import oops5_AccessControls.A;

public class Subclass2 extends A {
    public Subclass2(int n,String nam){
        super(n,nam);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(21,"r");
        int[] array = obj.arr;  //// protected data members can be accessed in the subclass in different package as well.
    }
}

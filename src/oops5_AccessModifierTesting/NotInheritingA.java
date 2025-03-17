package oops5_AccessModifierTesting;

import oops5_AccessControls.A;

public class NotInheritingA {
    public static void main(String[] args) {
        A obj = new A(21, "R");

////        int[] arr = obj.arr   // protected member cannot be accessed in another package, inside not a subclass
    }
}

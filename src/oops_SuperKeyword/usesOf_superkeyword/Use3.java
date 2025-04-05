package oops_SuperKeyword.usesOf_superkeyword;

//// to invoke immediate parent class constructor  (by default)
public class Use3 extends B{

    Use3(){
        super();  /// must be first statemnt in the constructor body
        System.out.println("Child class constructor");
////        super()  ------> Error
    }

    public static void main(String[] args) {
        Use3 obj = new Use3();

    }
}

class B{

    B(){
        System.out.println("Parent class constructor");
    }
}

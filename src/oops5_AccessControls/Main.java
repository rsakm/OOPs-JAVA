package oops5_AccessControls;

public class Main {
    public static void main(String[] args) {
        A obj = new A(21,"Rajshree");
//        // Accessing the data members
//        // Modifying the data members


////        obj.num;   // can't access private data member
        String name = obj.name;   //// public : Can be accessed from anywhere

    }
}

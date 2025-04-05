package oops_thisKeyword.useOf_thisKeyword;

//// this keyword can be used to invoke current class constructor
public class Use3 {

    Use3(){
        this(10);
        System.out.println("No argument constructor");
    }

    Use3(int a){
//        this();  //// invoking current class constructor
        System.out.println("Parameterised constructor");
    }

    public static void main(String[] args) {
        Use3 obj = new Use3();

//        Use3 ob = new Use3(10);
    }

}

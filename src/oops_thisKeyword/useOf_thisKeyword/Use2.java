package oops_thisKeyword.useOf_thisKeyword;


//// this keyword can be used to invoke the current class method (implicitly).
public class Use2 {



    public void display() {
        System.out.println("Rajshree here...!!");
    }

    void show(){
        display();

//        // or
//        this.display();

//        // if u do not use this keyword, compiler automatically adds this keyword while invoking the method.
    }

    public static void main(String[] args) {
        Use2 obj = new Use2();

        obj.show();
    }
}

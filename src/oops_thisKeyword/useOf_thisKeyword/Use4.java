package oops_thisKeyword.useOf_thisKeyword;
// // As an argument in the method
public class Use4 {

    void method1(Use4 obj){
        System.out.println("Method 1");

    }

    void method2(){
        method1(this);
    }

    public static void main(String[] args) {
        Use4 ob = new Use4();
        ob.method2();


    }
}

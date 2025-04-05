package oops_thisKeyword.useOf_thisKeyword;

//// this keyword can be used to pass as an argument in the constructor call.

public class Use5 {

    void method(){
        Demo ob = new Demo(this);
    }
    public static void main(String[] args) {
        Use5 obj = new Use5();
        obj.method();
    }

}
class Demo{
    Demo(Use5 obj){
        System.out.println("Constructor Of Demo Class");
    }

}
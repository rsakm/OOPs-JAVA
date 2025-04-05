package oops_thisKeyword.useOf_thisKeyword;

//// this keyword can be used to return the current class instance from method
public class Use6 {

    Use6 method(){
        return this;
    }

    public static void main(String[] args) {
        Use6 obj = new Use6();
        obj.method();
        System.out.println(obj.method());
    }
}

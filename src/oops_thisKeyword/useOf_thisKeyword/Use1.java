package oops_thisKeyword.useOf_thisKeyword;


//// this keyword is used to invoke current class instance variable.
public class Use1 {
    int i;

    public void setI(int i) {
        this.i = i;
    }

    void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Use1 obj = new Use1();
        obj.setI(10);
        obj.show();
    }
}

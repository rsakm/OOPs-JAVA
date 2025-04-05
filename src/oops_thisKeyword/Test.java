package oops_thisKeyword;

public class Test {

    int i;

    public void setI(int i) {
        i = i;
    }

    public void display(){
        System.out.println(i);
    }
}

class UseTEst{
    public static void main(String[] args) {
        Test t = new Test();
        t.setI(10);
        t.display();   //// i = 0 as this is not used and i =i refers to local var getting assigned to self

        Test2 t2 = new Test2();
        t2.setI(10);
        t2.display();
    }
}


class Test2{
    int i ;

    public void setI(int i) {
        this.i = i;
    }

    public void display(){
        System.out.println(i);
    }
}

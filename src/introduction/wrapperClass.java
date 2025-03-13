package introduction;

public class wrapperClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num1 = 25;
        Integer num2 = 30;
        swap(a,b);   // // not swaped

        swaap2(num1,num2);
        System.out.println(a + " "+b);

        System.out.println(num1 + " "+num2);

        final int c = 4;
//        c=9;    // can't do

        A obj;

        for(int i = 0;i<100000000;i++){
            obj = new A("random "+i);
        }
    }

    static void swap(int a, int b){
        Integer temp = a;
        a=b;
        b=temp;
    }

    static void swaap2(Integer a, Integer b){
        int temp = a;
        a=b;
        b=temp;
    }
}

class A{
    final int num = 10;
    String name ;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();

        System.out.println("Object is destroyed...!");
    }
}

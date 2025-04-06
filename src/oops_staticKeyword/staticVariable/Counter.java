package oops_staticKeyword.staticVariable;

public class Counter {
//    int count = 0;
    static int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
//        Counter c1 = new Counter();  // 1
//        Counter c2 = new Counter();  // 1
//        Counter c3 = new Counter();  // 1

        Counter c1 = new Counter();  //1
        Counter c2 = new Counter();  //2
        Counter c3 = new Counter();  //3
    }
}

package oops2_Singleton;

public class Singleton {
//    private int num =10;
    private Singleton(){

    }

    private static Singleton obj;

    public static Singleton getInstance(){
//        // check whether one object has been created

        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }
}

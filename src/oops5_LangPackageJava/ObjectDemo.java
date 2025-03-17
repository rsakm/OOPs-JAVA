package oops5_LangPackageJava;
//// The lang package is an inbuilt java package inside Java folder.
//// Automatically imported inside every java file, contains language specific stuffs.
//// lang package contains Object class

//// The Object class is the root of the class hierarchy in java.
//// Every class extends Object class
public class ObjectDemo {

    int num;
    public  ObjectDemo(int num){
        this.num = num;
    }


//    // hashCode basically gives the number representation of an object, returns random integer value, not an address
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(21);
        System.out.println(obj.hashCode());
        ObjectDemo obj2 = new ObjectDemo(21);
        System.out.println(obj2.hashCode());

        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj.getClass());
    }
}

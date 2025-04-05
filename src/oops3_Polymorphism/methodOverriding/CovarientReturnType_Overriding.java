package oops3_Polymorphism.methodOverriding;

public class CovarientReturnType_Overriding {

    Object show(){
        System.out.println("Parent class method");
        return null;
    }
}

class XYZ extends CovarientReturnType_Overriding{
    String show(){
        System.out.println("Child class method");
        return "xyz";
    }


    public static void main(String[] args) {
        CovarientReturnType_Overriding obj = new CovarientReturnType_Overriding();
        obj.show();

        XYZ ob = new XYZ();
        ob.show();
    }
}
